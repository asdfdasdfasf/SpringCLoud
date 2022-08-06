package com.kyrie.study.controller;
import com.kyrie.study.domain.CommonResult;
import com.kyrie.study.domain.HostInfo;
import com.kyrie.study.domain.Payment;
import com.kyrie.study.domain.ServiceInfo;
import com.kyrie.study.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/payment/discovery")
    public CommonResult discovery(){
        //获取所有注册到注册中心的服务的名称
        List<String> services = discoveryClient.getServices();
        //创建返回对象
        ServiceInfo serviceInfo=new ServiceInfo();
        //创建服务名称列表
        List<String> serviceNameList=new ArrayList<>();
        for (String service : services) {
            serviceNameList.add(service);
        }
        serviceInfo.setServiceNameList(serviceNameList);
        //获取指定微服务名称下所有机器的信息列表
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        List<HostInfo> hostInfos=new ArrayList<>();
        for (ServiceInstance instance : instances) {
            HostInfo hostInfo=new HostInfo();
            hostInfo.setHostName(instance.getHost());
            hostInfo.setPort(instance.getPort());
            hostInfo.setUrl(instance.getUri().toString());
            hostInfos.add(hostInfo);
        }
        serviceInfo.setInfoList(hostInfos);
        return new CommonResult(200,"成功!",serviceInfo);
    }

    /**
     * 模拟服务调用请求超时的情况
     * @return
     */
    @GetMapping("/openFeign/timeout")
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
