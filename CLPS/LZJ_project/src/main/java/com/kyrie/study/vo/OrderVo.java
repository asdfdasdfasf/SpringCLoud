package com.kyrie.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 21:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo {
    private int id;

    private String title;

    private String houseType;

    private String price;

    private String rentType;

    private int commentState;

    private String img;
}
