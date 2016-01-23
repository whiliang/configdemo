package com.patterncat.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by patterncat on 2016-01-23.
 */
@Component
@RefreshScope
public class DemoService {

    @Value("${msg:defaultMsg}")
    private String msg;

    public String getMsg() {
        return "Hello " + this.msg;
    }
}
