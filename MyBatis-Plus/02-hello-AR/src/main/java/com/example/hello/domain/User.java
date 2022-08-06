package com.example.hello.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:44
 */
@Data
public class User extends Model<User> {
    @TableId(value="id",type=IdType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    @TableField(exist = false)
    private double salary;
    /**
     * 指定当前实体类的主键属性
     * @return
     */
    @Override
    public Serializable pkVal() {
        return id;
    }
}
