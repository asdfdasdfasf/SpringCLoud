package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.CompletableFuture;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 10:49
 */
@Data
public class CommonResult<T>{
    private int code;

    private String msg;

    private T data;

    public CommonResult(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static CommonResult success(String msg,Object data){
        return new CommonResult(200,msg,data);
    }

    public static CommonResult fail(String msg){
        return new CommonResult(500,msg,null);
    }
}
