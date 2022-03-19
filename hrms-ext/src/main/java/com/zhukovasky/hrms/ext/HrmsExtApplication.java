package com.zhukovasky.hrms.ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HrmsExtApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsExtApplication.class,args);
    }
}
