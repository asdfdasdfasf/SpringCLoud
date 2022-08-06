package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.BuyActionMapper;
import com.kyrie.study.pojo.ProductUser;
import com.kyrie.study.service.BuyActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:51
 */
@Service
public class BuyActionServiceImpl implements BuyActionService {

    @Resource
    private BuyActionMapper actionMapper;

    /**
     * 商品预订
     * @param id
     * @param user
     * @return
     */
    @Override
    public CommonResult buyAction(String id, String user) {
        //查询是否有预定信息
       int count=actionMapper.queryProductById(id);
       //保存订单信息
       if(count==0){
           actionMapper.saveProductInfo(id,user);
           return CommonResult.success("预定成功");
       }else{
           //查询是否是自己的订单
           System.out.println("user="+user+" id="+id);
           ProductUser productUser=actionMapper.queryByName(user,id);
           if(productUser==null){
               return CommonResult.fail(500,"已经被别人预定了，手满无！");
           }
           return CommonResult.fail(500,"已经预定了，不可重复预定");
       }
    }
}
