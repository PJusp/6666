package com.team.house.housebackapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.team.house.housebackapi.mapper")//扫描mapper
@ServletComponentScan("com.team.house.housebackapi.filter")//扫描过滤器
public class HousebackapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousebackapiApplication.class, args);
    }

}
