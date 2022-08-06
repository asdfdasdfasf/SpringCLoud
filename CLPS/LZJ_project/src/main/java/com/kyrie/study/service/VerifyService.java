package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 20:36
 */
public interface VerifyService {
    /**
     * 发送验证码验证
     * @param phone
     * @return
     */
    CommonResult verifyCode( String phone);
}
