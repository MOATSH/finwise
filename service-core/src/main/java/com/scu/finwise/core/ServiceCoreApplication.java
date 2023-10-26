package com.scu.finwise.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Program: finwise
 * @Description:
 * @Author: MOATSH
 * @Create: 2023-10-26 10:56
 **/

@SpringBootApplication
@ComponentScan({"com.scu.finwise"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }

}
