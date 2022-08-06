package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:48
 */
public interface BuyActionService {

    CommonResult buyAction(String id, String user);

}
