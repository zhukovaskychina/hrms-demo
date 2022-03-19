package com.zhukovasky.hrms.serviceimpl;

import com.zhukovasky.hrms.service.AuthCheckService;
import org.springframework.stereotype.Service;

@Service
public class AuthCheckServiceImpl implements AuthCheckService {
    @Override
    public boolean authcheck(String userName, String password) {
        return false;
    }
}
