package com.kyrie.study.service.imp;
import com.kyrie.study.dao.PaymentDao;
import com.kyrie.study.service.PaymentService;
import com.kyrie.study.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/21 19:03
 */
@Service
public class PaymentServiceImp implements PaymentService {
    @Autowired
    private PaymentDao dao;

    @Override
    public int create(Payment payment) {
        return dao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return dao.getPaymentById(id);
    }
}
