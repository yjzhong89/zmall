package com.zyj.zmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yjzhong
 * @Date: 2020/12/6 15:47
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZmallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmallGatewayApplication.class, args);
    }
}
