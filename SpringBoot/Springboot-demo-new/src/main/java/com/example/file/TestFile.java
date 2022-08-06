package com.example.file;

import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/21 10:45
 */
public class TestFile {
    public static void main(String[] args) {
        try {
            InputStream stream=new FileInputStream("Hello.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
