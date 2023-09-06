package cn.icexmoon.codegendemo.codegenerator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.Controller;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : code-gen-demo
 * @Package : cn.icexmoon.codegendemo.codegenerator
 * @ClassName : .java
 * @createTime : 2023/9/6 11:09
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 使用配置类运行代码生成器
 */
public class CodeGeneratorRunner {
    private CodeGeneratorConfig config;

    /**
     * 构造器
     *
     * @param config 代码生成器配置
     */
    public CodeGeneratorRunner(CodeGeneratorConfig config) {
        this.config = config;
    }

    /**
     * 运行代码生成器生成代码
     */
    public void run() {
        config.getModels().forEach((modelName, tables) -> {
            FastAutoGenerator generator = this.buildModelGenerator(modelName, tables);
            generator.execute();
        });
    }

    /**
     * 为一个模块创建代码生成器
     *
     * @param modelName 模块名称
     * @param tables    模块包含的表
     * @return MP 代码生成器
     */
    private FastAutoGenerator buildModelGenerator(String modelName, CodeGeneratorConfig.Tables tables) {
        // 从配置文件读取数据库连接信息
        return FastAutoGenerator.create(config.getDbConnInfo().getUrl(),
                        config.getDbConnInfo().getUserName(),
                        config.getDbConnInfo().getPassword())
                .globalConfig(builder -> {
                    builder.author(config.getAuthor()) // 设置作者
                            .outputDir(config.getHomeDir() + "/src/main/java"); // 指定输出目录
                    if (config.isAddSwaggerAnnotation()) {
                        // 开启 swagger 模式
                        builder.enableSwagger();
                    }
                    if (!config.isOpenDirAfterGen()) {
                        builder.disableOpenDir();
                    }
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .packageConfig(builder -> {
                    String xmlPath = String.format("%s/src/main/resources/%s/%s/mapper",
                            config.getHomeDir(),
                            config.getProjectPackageName().replace('.', '/'),
                            modelName);
                    builder.parent(config.getProjectPackageName()) // 设置父包名
                            .moduleName(modelName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, xmlPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables.getTableNames()) // 设置需要生成的表名
                            .addTablePrefix(tables.getTableNamePrefixes()); // 设置过滤表前缀
                    if (config.isUseLombok()) {
                        builder.entityBuilder()
                                .enableLombok();
                    }
                    Controller.Builder controllerBuilder = builder.controllerBuilder();
                    if (config.isControllerOverride()) {
                        controllerBuilder.fileOverride();
                    }
                    if (config.isUseRestController()){
                        controllerBuilder.enableRestStyle();
                    }
                    if (config.isServiceOverride()){
                        builder.serviceBuilder().fileOverride();
                    }
                    if (config.isEntityOverride()){
                        builder.entityBuilder().fileOverride();
                    }
                    if (config.isMapperOverride()){
                        builder.mapperBuilder().fileOverride();
                    }
                });
    }
}
