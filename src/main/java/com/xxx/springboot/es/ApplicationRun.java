package com.xxx.springboot.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author JN
 * @Date 2020/5/3 17:37
 * @Version 1.0
 * @Description
 **/
@SpringBootApplication
@MapperScan("com.xxx.springboot.es.mapper")
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }

}
