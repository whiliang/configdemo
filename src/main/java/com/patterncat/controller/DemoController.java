package com.patterncat.controller;

import com.patterncat.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by patterncat on 2016-01-23.
 */
@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/msg")
    String getMsgFromConfig(){
        return demoService.getMsg();
    }
}
