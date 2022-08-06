package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.events.Event;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 20:37
 * 关系表
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProductUser {
    private int  id;

    private String username;

    private int productId;

    private int commentState;
}
