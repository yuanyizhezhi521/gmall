package com.mbp.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.ManagedBean;

@SpringBootApplication
@MapperScan(basePackages="com.mbp.gmall.user.mapper")
public class GmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApplication.class, args);
    }

}
