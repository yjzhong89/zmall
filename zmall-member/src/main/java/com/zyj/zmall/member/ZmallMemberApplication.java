package com.zyj.zmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:39
 */
@MapperScan("com.zyj.zmall.member.dao")
@SpringBootApplication
public class ZmallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallMemberApplication.class, args);
    }
}
