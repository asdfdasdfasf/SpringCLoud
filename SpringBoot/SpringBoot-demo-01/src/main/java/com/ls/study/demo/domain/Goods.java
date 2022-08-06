package com.ls.study.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/23 20:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "goods")
public class Goods {
    private Integer goodId;
    private String goodName;
    private List items;
}
