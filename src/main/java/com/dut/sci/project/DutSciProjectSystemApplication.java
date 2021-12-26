package com.dut.sci.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.dut.**.mapper")
@SpringBootApplication
public class DutSciProjectSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DutSciProjectSystemApplication.class, args);
    }

}
