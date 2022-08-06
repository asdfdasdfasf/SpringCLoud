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
 * @date 2022/3/30 15:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("登录请求参数类")
public class LoginParam {

    /**
     * 用户名
     */
    @ApiModelProperty("登录用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("登录密码")
    private String password;
}
