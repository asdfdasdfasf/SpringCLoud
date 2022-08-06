package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.SearchMapper;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.service.ProductSearchService;
import com.kyrie.study.vo.ProductSearchVo;
import com.kyrie.study.vo.param.SearchParam;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 12:10
 */
@Service
public class ProductSearchServiceImpl implements ProductSearchService {

    @Resource
    private SearchMapper searchMapper;
    /**
     * 根据查询条件搜索物品信息
     * @param searchParam
     * @return
     */
    @Override
    public CommonResult searchProductByCondition(SearchParam searchParam) {
        //获取请求参数信息
        String city=searchParam.getCity();
        String content=searchParam.getContent();
        int page=searchParam.getPage();
        //查询数据库
        List<Product> products = searchMapper.searchProductByCondition(city, content, page);
        if(products.size()==0){
            return CommonResult.success(products,false);
        }
        //数据转换
        List<ProductSearchVo> productSearchVoList=new ArrayList<>();
        products.forEach(product->{
            ProductSearchVo vo=copy(product);
            productSearchVoList.add(vo);
        });
        return CommonResult.success(productSearchVoList,true);
    }

    /**
     * 数据转换
     * @param product
     * @return
     */
    private ProductSearchVo copy(Product product) {
        ProductSearchVo searchVo=new ProductSearchVo();
        BeanUtils.copyProperties(product,searchVo);
        //价格展示
        BigDecimal price = product.getPrice();
        searchVo.setPrice("<h3>"+price.toString()+"</h3>");
        //图片地址拼接
        searchVo.setImg(Const.LINK_BASE_URL+product.getImg());
        return searchVo;
    }

}
