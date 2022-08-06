package com.kyrie.study.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/27 10:24
 * 该类使用在Discovery信息展示中
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceInfo {
    /**
     * 服务名称列表
     */
    List<String> serviceNameList;

    /**
     * 服务详细信息列表
     */
    List<HostInfo> infoList;
}
