package com.zyj.zmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:51
 */
@MapperScan("com.zyj.zmall.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ZmallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallOrderApplication.class, args);
    }
}
