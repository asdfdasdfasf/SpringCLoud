package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.CommentMapper;
import com.kyrie.study.pojo.Comment;
import com.kyrie.study.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 19:23
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public CommonResult getCommentList(int id, int number) {
        //获取所有的评论
        List<Comment> commentList=commentMapper.selectComment(id,number*6);
        if(commentList.size()==0){
            return CommonResult.success(commentList,false);
        }
        return CommonResult.success(commentList,true);
    }
}
