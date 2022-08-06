package com.kyrie.study.controller;

import com.kyrie.study.domain.CommonResult;
import com.kyrie.study.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/22 11:04
 */
@RestController
public class OrderController {

//    private static final String PAYMENT_URL="http://localhost:8001";
    private static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate template;

    @GetMapping("/consumer/payment/find/{id}")
    public CommonResult<Payment> findPayment(@PathVariable("id") Long id){
        CommonResult result = template.getForObject(PAYMENT_URL + "/payment/find/"+id+"", CommonResult.class);
        return result;
    }

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> createPayment(Payment payment){
        CommonResult result = template.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        return result;
    }
}
