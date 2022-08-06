package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 11:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User implements Serializable {
    private static final long serialVersionUID = -4967373518256793079L;

    @ApiModelProperty("用户编号")
    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPwd;
}
