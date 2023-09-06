package cn.icexmoon.codegendemo.codegenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : code-gen-demo
 * @Package : cn.icexmoon.codegendemo
 * @ClassName : .java
 * @createTime : 2023/9/6 10:52
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 对 MP 代码生成器的可编辑项目进行封装，适配的 MP 代码生成器版本为 3.5.2
 */
@Getter
@Setter
public class CodeGeneratorConfig {
    @Getter
    @NoArgsConstructor
    public static class Tables {
        // 一组表名
        private List<String> tableNames = new LinkedList<>();
        // 表名拥有的前缀
        private List<String> tableNamePrefixes = new LinkedList<>();

        public Tables addTableName(String tn) {
            this.tableNames.add(tn);
            return this;
        }

        public Tables addTableNamePrefix(String prefix) {
            this.tableNamePrefixes.add(prefix);
            return this;
        }

        public Tables addTableNames(List<String> tableNames){
            this.tableNames.addAll(tableNames);
            return this;
        }

        public Tables addTableNames(String ... tableNames){
            this.tableNames.addAll(Arrays.asList(tableNames));
            return this;
        }
    }

    /**
     * 数据库连接信息
     */
    @Value
    public static class DbConnInfo {
        String userName;
        String password;
        String url;
    }

    // 作者
    private String author;
    // 生成代码目录（使用项目根目录）
    private String homeDir = System.getProperty("user.dir");
    // 是否为生成的代码添加 swagger 注解
    private boolean addSwaggerAnnotation;
    // 是否覆盖已生成的 Controller 文件
    private boolean controllerOverride = false;
    // 是否覆盖已生成的 service 文件
    private boolean serviceOverride = false;
    // 是否覆盖已生成的 entity 文件
    private boolean entityOverride = false;
    // 是否覆盖已生成的 mapper 文件
    private boolean mapperOverride = false;
    // 项目包名
    private String projectPackageName;
    // 模块，key 表示模块名，value 表示模块包含的表信息
    private Map<String, Tables> models;
    // 数据库连接信息
    private DbConnInfo dbConnInfo;
    // 是否对实体类使用 Lombok 注解
    private boolean useLombok = true;
    // 生成代码后是否打开目录
    private boolean openDirAfterGen = false;
    // 生成的 Controller 使用 @RestController
    private boolean useRestController = true;

    /**
     * 从 application.yml 加载数据库连接信息
     */
    public void loadDbConnInfoFromProperties() {
        // 获取资源对象
        Resource resource = new ClassPathResource("application.yml");
        // 解析 yaml
        YamlPropertiesFactoryBean yamlProFb = new YamlPropertiesFactoryBean();
        yamlProFb.setResources(resource);
        Properties properties = yamlProFb.getObject();
        // 获取属性
        final String PROPERTY_PREFIX = "spring.datasource.";
        String url = properties.getProperty(PROPERTY_PREFIX + "url");
        String username = properties.getProperty(PROPERTY_PREFIX + "username");
        String password = properties.getProperty(PROPERTY_PREFIX + "password");
        this.dbConnInfo = new DbConnInfo(username, password, url);
    }
}
