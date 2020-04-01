package com.abu.mpboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.abu.mpboot.mapper")
@EnableSwagger2
public class MpBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpBootApplication.class, args);
    }

}
