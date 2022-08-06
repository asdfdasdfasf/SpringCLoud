package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.HotProductMapper;
import com.kyrie.study.pojo.Image;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.service.HotProductService;
import com.kyrie.study.vo.ProductVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 14:26
 */
@Service
public class HotProductServiceImpl implements HotProductService {

    private static final int LIMIT_COUNT=4;

    @Resource
    private HotProductMapper hotProductMapper;
    /**
     * 根据城市查询最热商品信息
     * @param city
     * @return
     */
    @Override
    public CommonResult<ProductVo> queryHotProductList(String city) {
        //查询最热商品信息
        List<Product> products = hotProductMapper.selectProductByCity(city,LIMIT_COUNT);
        //当商品数量不足4条的时候，从其他城市的最热商品补足信息
        if(products.size()<4){
            List<Product> otherProducts=hotProductMapper.selectProductByOtherCity(city,LIMIT_COUNT-products.size());
            products.addAll(otherProducts);
        }
        List<ProductVo> productVoList=new ArrayList<>();
        products.forEach(product->{
            productVoList.add(copy(product));
        });
        return CommonResult.success(productVoList);
    }

    /**
     * 对象属性复制
     * @param product
     * @return
     */
    private ProductVo copy(Product product) {
        //路径拼接
        ProductVo productVo=new ProductVo();
        BeanUtils.copyProperties(product,productVo);
        productVo.setImg(Const.LINK_BASE_URL+product.getImg());
        return productVo;
    }
}
