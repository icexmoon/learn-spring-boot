package cn.icexmoon.mybatisdemo.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.entity
 * @ClassName : .java
 * @createTime : 2023/9/4 15:16
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
