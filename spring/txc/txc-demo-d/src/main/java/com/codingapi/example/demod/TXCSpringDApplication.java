package com.codingapi.example.demod;

import com.codingapi.txlcn.client.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 * Date: 2018/12/25
 *
 * @author ujued
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class TXCSpringDApplication {

    public static void main(String[] args) {
        SpringApplication.run(TXCSpringDApplication.class, args);

    }
}
