package com.kyrie.study.util;

import com.aliyun.api.gateway.demo.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/1 9:43
 */
public class VerifyUtils {
    public static Boolean sendVerifyCode(String phone, String verifyCode) {
        String host = "https://miitangs09.market.alicloudapi.com";
        String path = "/v1/tools/sms/code/sender";
        String method = "POST";
        String appcode = "7ce226a67e784a60aaf3931029e9416a";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        //需要给X-Ca-Nonce的值生成随机字符串，每次请求不能相同
        headers.put("X-Ca-Nonce", UUID.randomUUID().toString());
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        querys.put("appcode", appcode);
        bodys.put("phoneNumber", phone);
        bodys.put("reqNo", "222");
        bodys.put("smsSignId", "0000");
        bodys.put("smsTemplateNo", "0001");
        bodys.put("verifyCode", verifyCode);
        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println("我的响应结果=" + response.toString());
            // 获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
