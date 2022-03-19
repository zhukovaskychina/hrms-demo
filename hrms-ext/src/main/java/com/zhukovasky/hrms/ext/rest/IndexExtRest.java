package com.zhukovasky.hrms.ext.rest;

import com.zhukovasky.hrms.service.AuthCheckService;
import com.zhukovasky.hrms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/index")
public class IndexExtRest {


    @Autowired
    private LoginService loginService;

    @Autowired
    private AuthCheckService authCheckService;

    @GetMapping("/rest")
    public String restIndex(){

        boolean first=this.loginService.login("hello","aaaaa");
        boolean second=this.authCheckService.authcheck("hello","bbbbb");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(first);
        stringBuffer.append(second);
        return stringBuffer.toString();
    }
}
