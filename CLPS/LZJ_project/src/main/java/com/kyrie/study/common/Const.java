package com.kyrie.study.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 12:09
 */
public interface Const {

    int SERVER_PORT=4006;

    /**
     * 本地服务器的根地址
     */
    String BASE_URL="http://localhost:"+SERVER_PORT;

    /**
     * 录播图的路径
     */
    String IMAGE_URL="/images";

    /**
     * 图片基路径
     */
    String LINK_BASE_URL="http://iwenwiki.com/api/livable";
}
