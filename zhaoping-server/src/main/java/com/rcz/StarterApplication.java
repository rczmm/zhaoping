package com.rcz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StarterApplication {
    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(StarterApplication.class, args);
        System.out.println("招聘系统启动成功！");
    }
}

