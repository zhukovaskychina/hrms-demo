package com.zhukovasky.hrms.serviceimpl;

import com.zhukovasky.hrms.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
