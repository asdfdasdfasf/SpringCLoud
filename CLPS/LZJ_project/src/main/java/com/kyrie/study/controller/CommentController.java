package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 19:19
 */
@RestController
@Api(tags="评论控制器")
public class CommentController {
    @Resource
    private CommentService commentService;

    @ApiOperation("获取用户评论信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "商品id",required = true),
            @ApiImplicitParam(name="page",value="页码",required = true)
    })
    @GetMapping("/comment")
    public CommonResult getCommentList(@RequestParam("id") int id,@RequestParam("page") int number){
       return commentService.getCommentList(id,number);
    }
}
