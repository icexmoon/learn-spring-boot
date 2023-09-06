package cn.icexmoon.codegendemo.codegenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : code-gen-demo
 * @Package : cn.icexmoon.codegendemo.codegenerator
 * @ClassName : .java
 * @createTime : 2023/9/6 11:38
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class Main {
    public static void main(String[] args) {
        CodeGeneratorConfig config = new CodeGeneratorConfig();
        config.loadDbConnInfoFromProperties();
        config.setAuthor("icexmoon@qq.com");
        config.setAddSwaggerAnnotation(false);
        config.setControllerOverride(true);
        config.setServiceOverride(true);
        config.setEntityOverride(true);
        config.setMapperOverride(true);
        config.setProjectPackageName("cn.icexmoon.codegendemo");
        Map<String, CodeGeneratorConfig.Tables> models = new HashMap<>();
        CodeGeneratorConfig.Tables userTables = new CodeGeneratorConfig.Tables();
        userTables.addTableNames("users");
        models.put("user", userTables);
        CodeGeneratorConfig.Tables orderTables = new CodeGeneratorConfig.Tables();
        orderTables.addTableNames("cart","order","order_item");
        models.put("order", orderTables);
        CodeGeneratorConfig.Tables itemTables = new CodeGeneratorConfig.Tables();
        itemTables.addTableNames("item");
        models.put("item", itemTables);
        config.setModels(models);
        CodeGeneratorRunner runner = new CodeGeneratorRunner(config);
        runner.run();
    }
}
