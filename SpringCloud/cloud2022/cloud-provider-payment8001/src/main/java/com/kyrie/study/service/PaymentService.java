package com.kyrie.study.service;

import com.kyrie.study.domain.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author kyrie
 */
public interface PaymentService{
    /**
     *向数据库中插入一条数据
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 通过id值查询指定的payment信息
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
