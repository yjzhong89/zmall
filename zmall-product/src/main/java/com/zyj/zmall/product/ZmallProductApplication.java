package com.zyj.zmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 19:57
 */

@MapperScan("com.zyj.zmall.product.dao")
@SpringBootApplication
public class ZmallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallProductApplication.class, args);
    }
}
