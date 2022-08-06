package com.kyrie.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoVo{
    private String years;

    private String type;

    private String level;

    private String style;

    private String orientation;
}
