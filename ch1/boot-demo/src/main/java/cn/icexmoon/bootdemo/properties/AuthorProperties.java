package cn.icexmoon.bootdemo.properties;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : boot-demo
 * @Package : cn.icexmoon.bootdemo.properties
 * @ClassName : .java
 * @createTime : 2023/9/3 11:43
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
@ConfigurationProperties(prefix = "author")
@Data
@Validated
public class AuthorProperties {
    @NotNull
    @Length(min = 2,max = 10)
    String name;
    @NotNull
    @Min(0)
    @Max(150)
    Integer age;
    @NotNull
    @Size(min = 1, max = 10)
    List<String> hobbies;
}
