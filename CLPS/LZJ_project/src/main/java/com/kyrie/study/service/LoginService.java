package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.vo.param.LoginParam;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:14
 */
public interface LoginService {

    CommonResult login(LoginParam loginParam);

}
