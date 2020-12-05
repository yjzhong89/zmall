package com.zyj.zmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:32
 */
@MapperScan("com.zyj.zmall.coupon.dao")
@SpringBootApplication
public class ZmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallCouponApplication.class, args);
    }
}
