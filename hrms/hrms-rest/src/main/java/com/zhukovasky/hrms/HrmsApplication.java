package com.zhukovasky.hrms;

import com.wiseoutbound.abstractHandler.CustomerRestControllerFilter;
import com.wiseoutbound.classloader.wrapper.SpringBootDevOpsApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages ="com.zhukovasky",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {CustomerRestControllerFilter.class})
        }
)
public class HrmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsApplication.class,args);
       // SpringBootDevOpsApplication.run(HrmsApplication.class,args);
    }
}
