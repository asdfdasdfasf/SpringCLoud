package com.kyrie.study.vo;

import com.kyrie.study.pojo.Info;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailVo {

    /**
     * 标题
     */
    private String title;

    /**
     * 价格
     */
    private String price;

    /**
     * 出租类型
     */
    private String rentType;

    /**
     * 房屋类型
     */
    private String houseType;

    /**
     * 详细信息
     */
    private InfoVo info;

    /**
     * 图片地址信息
     */
    private List<String> imgs;
}
