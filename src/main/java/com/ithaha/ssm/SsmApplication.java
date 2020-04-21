package com.ithaha.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ithaha.ssm.mapper")
public class SsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmApplication.class, args);
    }
}
