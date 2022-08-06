package com.kyrie.study.controller;

import com.kyrie.study.domain.CommonResult;
import com.kyrie.study.domain.Payment;
import com.kyrie.study.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/25 13:42
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> result = paymentService.getPaymentById(id);
        return result;
    }
    @GetMapping("/consumer/openFeign/timeout")
    public String timeout(){
        String timeout = paymentService.timeout();
        return timeout;
    }
}
