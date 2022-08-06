package com.kyrie.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/21 10:02
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
