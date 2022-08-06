package com.example.springbootdemoadmin;

import org.springframework.boot.context.properties.bind.handler.IgnoreTopLevelConverterNotFoundBindHandler;

import java.util.ArrayList;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/31 11:36
 */
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
    }
    public void show(Object... args){
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

}
enum Season{
    Spring(9),Window(2),Code(3),James(4);
    private Integer number;
    private Season(int n){
        this.number=n;
    }
    public Integer getNumber(){
        return this.number;
    }
}
