package com.example.utils;

import com.example.exception.ParamsException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 12:13
 */
public class AssertUtil {

    /**
     * 判断结果是否为true
     *		如果结果为true，抛出异常
     * @param
     * @return
     */
    public static void isTrue(Boolean flag, String msg){
        if(flag){
            throw new ParamsException(msg);
        }
    }

}