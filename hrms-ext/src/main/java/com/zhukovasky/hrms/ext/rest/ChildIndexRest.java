package com.zhukovasky.hrms.ext.rest;

import com.zhukovasky.hrms.entity.LoginParams;
import com.zhukovasky.hrms.service.AuthCheckService;
import com.zhukovasky.hrms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
