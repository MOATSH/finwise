package com.scu.finwise.core.controller.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Program: finwise
 * @Description:
 * @Author: MOATSH
 * @Create: 2023-12-27 00:34
 **/

@FeignClient(name = "testFeignInterface", url = "http://localhost:8120")
public interface MyFeignClient {
    @GetMapping("//api/sms/testFeignInterface")
    String getSomeData();
}
