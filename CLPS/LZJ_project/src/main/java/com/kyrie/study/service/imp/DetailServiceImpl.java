package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.DetailMapper;
import com.kyrie.study.pojo.Image;
import com.kyrie.study.pojo.Info;
import com.kyrie.study.pojo.Product;
import com.kyrie.study.service.DetailService;
import com.kyrie.study.vo.DetailVo;
import com.kyrie.study.vo.InfoVo;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

import javax.annotation.Resource;
import javax.xml.soap.Detail;
import java.util.ArrayList;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:03
 */
@Service
public class DetailServiceImpl implements DetailService {

    @Resource
    private DetailMapper detailMapper;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public CommonResult queryDetailsById(int id) {
        Object productDetail = redisTemplate.opsForValue().get("lzj_product_detail_" + id);
        DetailVo detailVoList=null;
        if(productDetail==null){
            //通过id查询对应的商品信息
            Product product=detailMapper.selectDetailsById(id);
            //获取id，通过id查询info的信息
            int productId = product.getId();
            //通过productId查询info
            Info info=detailMapper.queryInfoById(productId);
            //通过id查询图片信息
            List<Image> images=detailMapper.queryImagsById(productId);
            detailVoList =copy(product,info,images);
            System.out.println("将信息存入到缓存中了~~~~~~~");
            redisTemplate.opsForValue().set("lzj_product_detail_" + id,detailVoList);
        }
        else{
            System.out.println("从缓存中获取到了数据~~~~~~~~~");
            detailVoList =(DetailVo) redisTemplate.opsForValue().get("lzj_product_detail_" + id);
        }
        return CommonResult.success(detailVoList);
    }

    /**
     * 封装返回数据
     * @param product
     * @param info
     * @param images
     * @return
     */
    private DetailVo copy(Product product, Info info, List<Image> images) {
        DetailVo detailVo=new DetailVo();
        BeanUtils.copyProperties(product,detailVo);
        detailVo.setHouseType(product.getHouseType().split("\\|")[0]);
        //将info转换成infoVo
        InfoVo vo=new InfoVo();
        BeanUtils.copyProperties(info,vo);
        //设置价格
        detailVo.setPrice(product.getPrice().toString());
        //时间格式化
        String format = DateFormatUtils.format(info.getYears(), "yyyy年");
        vo.setYears(format);
        //封装图片地址
        List<String> imgList=new ArrayList<>();
        for (Image image : images) {
            imgList.add(Const.LINK_BASE_URL+image.getUrl());
        }
        detailVo.setImgs(imgList);
        detailVo.setInfo(vo);
        return detailVo;
    }
}
