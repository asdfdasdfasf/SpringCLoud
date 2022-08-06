package com.ls.study.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:44
 */

/**
 * 1.mybatis-plus会自动去数据库找首字母小写的同名表，找不到的话就会报错
 *      可以使用@TableName("数据库表名") 指定和数据库中的哪个表对应
 * 2.在mybatis-plus中需要设置主键策略，如果不设置的话主键是随机数字，而不会自增
 *      @TableId：value表示主键字段名    type表示主键的类型
 * 3.每个表中都要配置主键策略很繁琐，可以通过全局配置方式，在application.yaml中配置所有主键的策略
 * 4.同样的方式，我们也可以通过全局配置统一的表前缀来映射数据库中的表，配置见application.yaml中
 * 5.在mybatis-plus中默认设置了表和实体类的驼峰映射关系
 * 6.使用@TableField(value="数据库中列名") 用来指定该属性对应数据库中的表的哪一列
 * 7.使用@TableField(exist = false)用来指定该属性在数据库中没有对应的字段
 * 8.在mybatis-plus中插入数据后默认会将插入数据的主键赋值到该对象的对应列，在mybatis中需要设置userGeneratedKey和keyProperty实现
 * 9.mybatis-plus插入数据的时候会插入实体非空的属性列
 *
 * SpringBoot项目在集成MyBatis-plus的同时，如果有自定义的mapper.xml配置文件,默认放在resources文件夹下面的mapper目录下，是可以被解析到的
 * 不需要指定mybatis-plus.mapper-locations: classpath:myMapper/*.xml,如果文件夹的名字不叫这个的话，那么就需要指定mapper映射文件的位置
 */
@Data
//@TableName("user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("name")
    private String name;
    private String email;
    private Integer age;
    @TableField(exist = false)
    private double salary;
}
