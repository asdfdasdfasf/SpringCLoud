package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.CommentMapper;
import com.kyrie.study.mapper.FeelBackMapper;
import com.kyrie.study.pojo.ProductUser;
import com.kyrie.study.service.FeelBackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/31 16:31
 */
@Service
public class FeelBackServiceImpl implements FeelBackService {

    @Resource
    private FeelBackMapper feelBackMapper;

    @Resource
    private CommentMapper commentMapper;

    @Override
    public CommonResult feelBack(int orderId, String feelBack) {
        /**
         *   1、用户评论需要修改lzj_product_user comment_state的状态值
         *   2、向lzj_comment表中插入一条评论信息
         */
        //根据订单号查询到商品号
        ProductUser user =feelBackMapper.findUserNameById(orderId);
        //获取用户名
        String username = user.getUsername();
        // TODO: 2022/4/1 在添加评论之前需要判断是否已经评论 
        //向评论表中插入一条数据
        int data=commentMapper.addComment(username,feelBack,orderId);
        if(data==1){
            //更新comment_state状态
            int result=commentMapper.updateComment(orderId);
            return CommonResult.success("评价成功");
        }
        return CommonResult.fail(500,"评价失败");
    }
}
