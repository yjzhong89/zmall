package com.zyj.zmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:39
 */
@MapperScan("com.zyj.zmall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zyj.zmall.member.feign")
@SpringBootApplication
public class ZmallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallMemberApplication.class, args);
    }
}
