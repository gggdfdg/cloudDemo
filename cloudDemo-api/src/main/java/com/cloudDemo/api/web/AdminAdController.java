package com.cloudDemo.api.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.cloudDemo.core.util.ResponseUtil;
import com.cloudDemo.db.domain.Ad;
import com.cloudDemo.db.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/ad")
@Validated
public class AdminAdController {
    private final Log logger = LogFactory.getLog(AdminAdController.class);

    @Autowired
    private AdService adService;

    @PostMapping("/create")
    public Object create(@RequestBody Ad ad){
        adService.add(ad);
        return ResponseUtil.ok(ad);
    }

}
