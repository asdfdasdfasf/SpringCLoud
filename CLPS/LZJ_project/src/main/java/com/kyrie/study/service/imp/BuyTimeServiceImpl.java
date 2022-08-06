package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.BuyTimeMapper;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.service.BuyTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.awt.color.CMMException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 13:10
 */
@Service
public class BuyTimeServiceImpl implements BuyTimeService {

    @Resource
    private BuyTimeMapper buyTimeMapper;

    @Override
    public CommonResult buyTime(int id) {
      int isExist=buyTimeMapper.isExist(id);
      if(isExist==0){
          return CommonResult.fail(500,"商品不存在");
      }
      long timeStamp = System.currentTimeMillis()+10*1000;
      return CommonResult.success(timeStamp);
    }
}
