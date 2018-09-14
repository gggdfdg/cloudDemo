package com.cloudDemo.db.service;

import com.cloudDemo.db.dao.AdMapper;
import com.cloudDemo.db.domain.Ad;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdService {
    @Resource
    private AdMapper adMapper;

    public void add(Ad ad) {
        adMapper.insert(ad);
    }


}
