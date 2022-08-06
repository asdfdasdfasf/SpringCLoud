package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private String password;
}
