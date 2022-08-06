package com.kyrie.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/27 10:26
 * 映射一条服务信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostInfo {
    /**
     * 主机名称
     */
    private String hostName;
    /**
     * 主机端口号
     */
    private int port;
    /**
     * 主机访问地址
     */
    private String url;
}
