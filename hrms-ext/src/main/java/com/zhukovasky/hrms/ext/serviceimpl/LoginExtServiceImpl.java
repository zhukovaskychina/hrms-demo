package com.zhukovasky.hrms.ext.serviceimpl;

import com.zhukovasky.hrms.service.LoginService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class LoginExtServiceImpl implements LoginService {
    @Override
    public boolean login(String s, String s1) {
        System.out.println(s);
        System.out.println(s1);
        return true;
    }
}
