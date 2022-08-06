package com.kyrie.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/5 10:19
 */
@RestController
public class PaymentController {
    @Resource
    private RestTemplate restTemplate;

    private static final String PROVIDER_URL="http://cloud-provider-payment";

    @GetMapping("/payment/consumer/zk")
    public String consumer(){
        return  restTemplate.getForObject(PROVIDER_URL + "/payment/zk", String.class);
    }
}
