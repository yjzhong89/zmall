package com.zyj.zmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 21:00
 */
@MapperScan("com.zyj.zmall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ZmallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallWareApplication.class, args);
    }
}
