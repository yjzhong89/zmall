package com.zyj.zmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:32
 */
@MapperScan("com.zyj.zmall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ZmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallCouponApplication.class, args);
    }
}
