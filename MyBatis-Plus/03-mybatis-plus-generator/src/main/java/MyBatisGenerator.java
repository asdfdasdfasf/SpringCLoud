import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.Collections;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/7 10:10
 */
public class MyBatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatisplus", "root", "252525")
                //1. 全局配置
                .globalConfig(builder -> {
                    builder.author("kyrie") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\JavaCode\\MyBatis-Plus\\03-mybatis-plus-generator\\src\\main\\java"); // 指定输出目录
                })
                //2.包配置相关
                .packageConfig(builder -> {
                    builder.parent("com.example.study.generator") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\JavaCode\\MyBatis-Plus\\03-mybatis-plus-generator\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                //3.策略配置相关
                .strategyConfig(builder -> {
                    builder.addInclude("user","dept") // 设置需要生成的表名
                            .addTablePrefix("");// 设置过滤表前缀
                })
                .templateEngine( new VelocityTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
