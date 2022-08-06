package com.kyrie.study.service;

import com.kyrie.study.domain.CommonResult;
import com.kyrie.study.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="CLOUD-PAYMENT-SERVICE")
public interface PaymentService {
    @GetMapping(value = "/payment/find/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/openFeign/timeout")
    String timeout();
}
