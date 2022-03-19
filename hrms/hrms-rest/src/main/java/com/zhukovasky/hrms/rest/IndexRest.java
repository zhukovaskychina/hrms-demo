package com.zhukovasky.hrms.rest;

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
public class IndexRest {

    @Autowired
    private LoginService loginService;

    @Autowired
    private AuthCheckService authCheckService;

    @PostMapping("/login")
    public String loginAndAuthCheck(@RequestBody LoginParams loginParams){

        boolean resultfirst=this.loginService.login(loginParams.getUserName(),loginParams.getPassword());
        boolean resultsecond=this.authCheckService.authcheck(loginParams.getUserName(),loginParams.getPassword());

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("first:");
        stringBuffer.append(resultfirst);
        stringBuffer.append("\n");
        stringBuffer.append("second:");
                stringBuffer.append(resultsecond);
                return  stringBuffer.toString();
    }
}
