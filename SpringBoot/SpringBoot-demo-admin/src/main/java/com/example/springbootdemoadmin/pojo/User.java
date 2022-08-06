package com.example.springbootdemoadmin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/28 18:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
    private String userName;
    private String password;
}
