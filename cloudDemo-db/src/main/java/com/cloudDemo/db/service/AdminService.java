package com.cloudDemo.db.service;

import com.github.pagehelper.PageHelper;
import com.cloudDemo.db.dao.AdminMapper;
import com.cloudDemo.db.domain.Admin;
import com.cloudDemo.db.domain.Admin.Column;
import com.cloudDemo.db.domain.AdminExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public List<Admin> findAdmin(String username) {
        AdminExample example = new AdminExample();
        example.or().andUsernameEqualTo(username);
        return adminMapper.selectByExample(example);
    }

    private final Column[] result = new Column[]{Column.id, Column.username, Column.avatar};
    public List<Admin> querySelective(String username, Integer page, Integer limit, String sort, String order) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(username)){
            criteria.andUsernameLike("%" + username + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        
        PageHelper.startPage(page, limit);
        return adminMapper.selectByExampleSelective(example, result);
    }

    public int countSelective(String username, Integer page, Integer size, String sort, String order) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(username)){
            criteria.andUsernameLike("%" + username + "%");
        }

        return (int)adminMapper.countByExample(example);
    }

    public void add(Admin admin) {
        adminMapper.insertSelective(admin);
    }

    public Admin findById(Integer id) {
        return adminMapper.selectByPrimaryKeySelective(id, result);
    }

    public int updateByPrimaryKey(Admin admin){
        return adminMapper.updateByPrimaryKey(admin);
    }

    public int deleteByPrimaryKey(Integer id){
        return adminMapper.deleteByPrimaryKey(id);
    }
}
