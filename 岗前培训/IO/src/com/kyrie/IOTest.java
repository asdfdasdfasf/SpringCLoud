package com.kyrie;

import java.io.*;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/21 10:53
 */
public class IOTest {
    public static void main(String[] args) {
        File file=new File("D:\\JavaCode\\岗前培训\\IO\\src\\hello.txt");
        try {
            FileInputStream inputStream=new FileInputStream(file);
            InputStreamReader reader=new InputStreamReader(inputStream,"UTF-8");
            int len=0;
            char[] chars=new char[24];
            while((len=reader.read(chars))!=-1){
                System.out.println(new String(chars,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
