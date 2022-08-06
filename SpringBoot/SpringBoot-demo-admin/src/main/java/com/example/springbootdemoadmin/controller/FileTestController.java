package com.example.springbootdemoadmin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/30 14:10
 */

/**
 * 文件上传测试
 */
@Controller
@Slf4j
public class FileTestController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    /**
     * 处理上传文件请求
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email")String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("请求参数是:email={},username={},headerImg={},photos={}",email,username,headerImg,photos);
        if(!headerImg.isEmpty()){
            //保存到文件服务器，OSS服务器
            //获取原始文件名
            String fileName = headerImg.getOriginalFilename();
            //将文件保存到指定的位置
            headerImg.transferTo(new File("D:\\FileUpload\\"+fileName+""));
        }
        if(photos.length>0){
            for (MultipartFile photo : photos) {
                if(!photo.isEmpty()){
                    String originalName = photo.getOriginalFilename();
                    photo.transferTo(new File("D:\\FileUpload\\"+originalName+""));
                }
            }
        }
        return "index";
    }
}
