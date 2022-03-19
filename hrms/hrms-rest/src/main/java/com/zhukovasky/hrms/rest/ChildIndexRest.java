package com.zhukovasky.hrms.rest;

import com.zhukovasky.hrms.entity.LoginParams;
import com.zhukovasky.hrms.service.AuthCheckService;
import com.zhukovasky.hrms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Inherited;

@RestController
@RequestMapping("/index")
public class ChildIndexRest {
    @Autowired
    private LoginService loginService;

    @Autowired
    private AuthCheckService authCheckService;

    @PostMapping("/login")
    public String loginAndAuthCheck(@RequestBody LoginParams loginParams){

        System.out.println("======================child==============================");

        return "======================================================================";
    }
}
