package com.kyrie.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/6 9:29
 */
@RestController
public class PaymentController {
    @Resource
    private RestTemplate restTemplate;

    private static final String ADDRESS="http://consul-provider-payment";

    @GetMapping("/payment/consul")
    public String paymentConsul(){
       return  restTemplate.getForObject(ADDRESS+"/consul/payment",String.class);
    }
}
