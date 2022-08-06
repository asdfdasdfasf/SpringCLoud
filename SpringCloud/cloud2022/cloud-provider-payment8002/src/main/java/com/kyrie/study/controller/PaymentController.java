package com.kyrie.study.controller;
import com.kyrie.study.domain.CommonResult;
import com.kyrie.study.domain.Payment;
import com.kyrie.study.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/21 19:05
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService service;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/payment/find/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        log.info("我知道是我了：{}",id);
        Payment result = service.getPaymentById(id);
        if(result==null){
            return new CommonResult(500,"未查询到相关信息");
        }
        return new CommonResult(200,"查询数据成功:serverPort:"+serverPort,result);
    }

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        log.info("请求参数是:{}",payment);
        int result = service.create(payment);
        if(result>0){
            return new CommonResult(200,"插入数据成功serverPort:"+serverPort,result);
        }
        return new CommonResult(500,"插入数据失败serverPort:"+serverPort);
    }
}
