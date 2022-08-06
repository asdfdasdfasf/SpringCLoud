package com.kyrie.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/5 11:35
 */
@RestController
public class PaymentController {


    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/consul/payment")
    public String consulPayment(){
        return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
