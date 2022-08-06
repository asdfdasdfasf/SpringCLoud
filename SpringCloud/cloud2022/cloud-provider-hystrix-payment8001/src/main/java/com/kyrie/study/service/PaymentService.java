package com.kyrie.study.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/30 16:48
 */
@Service
public class PaymentService {
    /**
     * 正常访问，一切OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id+"\t"+"O(∩_∩)O";
    }

    /**
     * 超时访问，演示降级
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id){
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"O(∩_∩)O，耗费3秒";
    }

}
