package com.kyrie.study.dao;

import com.kyrie.study.domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/21 10:13
 */
@Mapper
public interface PaymentDao {
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
