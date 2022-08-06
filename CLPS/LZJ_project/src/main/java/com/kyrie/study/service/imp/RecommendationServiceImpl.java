package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.RecommendationMapper;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.service.RecommendationService;
import com.kyrie.study.vo.ProductVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 21:05
 */
@Service
public class RecommendationServiceImpl implements RecommendationService {

    private static final int LIMIT_NUM=4;

    @Resource
    private RecommendationMapper recommendationMapper;

    /**
     * 根据城市查询热门物品信息
     * @param city
     * @return
     */

    @Override
    public CommonResult getRecommendationList(String city) {
        List<Product> products = recommendationMapper.selectRecommendationByCity(city,LIMIT_NUM);
        if(products.size()<4){
           List<Product> otherProducts=recommendationMapper.selectRecommendationByOtherCity(city,LIMIT_NUM-products.size());
           products.addAll(otherProducts);
        }
        List<ProductVo> productVoList=new ArrayList<>();
        products.forEach(product -> {
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
