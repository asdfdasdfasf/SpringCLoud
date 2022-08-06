package com.kyrie.study.vo.param;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 9:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品查询类")
public class SearchParam {

    /**
     * 城市
     */
    @ApiModelProperty("城市")
    private String city;

    /**
     * 搜索条件
     */
    @ApiModelProperty("查询条件")
    private String content;

    /**
     * 当前页码
     */
    @ApiModelProperty("当前页码")
    private int page;
}
