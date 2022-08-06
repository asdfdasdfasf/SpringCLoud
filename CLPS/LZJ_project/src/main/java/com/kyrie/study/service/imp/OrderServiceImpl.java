package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.OrderMapper;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.pojo.ProductUser;
import com.kyrie.study.service.OrderService;
import com.kyrie.study.vo.OrderVo;
import com.kyrie.study.vo.ProductVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 20:13
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public CommonResult queryOrderByUser(String user) {
        // 获取用户预定的商品id号
        List<ProductUser> orders=orderMapper.selectOrderByName(user);
        //根据id去查询商品的信息
        List<OrderVo> orderVoList=new ArrayList<>();
        for (ProductUser order : orders) {
            //查询出商品信息
            Product product=orderMapper.selectByProductId(order.getProductId());
            //数据转换
            OrderVo orderVo=copy(product,order);
            orderVoList.add(orderVo);
        }
        return CommonResult.success(orderVoList);
    }

    /**
     * 数据转换
     * @param
     * @return
     */
    private OrderVo copy(Product product, ProductUser order) {
        OrderVo orderVo=new OrderVo();
        BeanUtils.copyProperties(product,orderVo);
        orderVo.setCommentState(order.getCommentState());
        orderVo.setImg(Const.LINK_BASE_URL+product.getImg());
        orderVo.setPrice(product.getPrice().toString());
        return orderVo;
    }

}
