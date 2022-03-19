package com.zhukovasky.hrms.ext.serviceimpl;

import com.zhukovasky.hrms.service.AuthCheckService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class AuthCheckExtServiceImpl implements AuthCheckService {
    @Override
    public boolean authcheck(String s, String s1) {
        System.out.println(s);
        System.out.println(s1);
        System.err.println("this is from two");
        return true;
    }
}
