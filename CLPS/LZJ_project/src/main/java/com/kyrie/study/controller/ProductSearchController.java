package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.ProductSearchService;
import com.kyrie.study.vo.param.SearchParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 22:15
 */
@Controller
@Api(tags="商品搜索控制器")
public class ProductSearchController {

    @Resource
    private ProductSearchService searchService;

    @ApiOperation("商品搜索")
    @GetMapping("/search")
    @ResponseBody
    public CommonResult searchProduct(SearchParam condition){
        return searchService.searchProductByCondition(condition);
    }
}
