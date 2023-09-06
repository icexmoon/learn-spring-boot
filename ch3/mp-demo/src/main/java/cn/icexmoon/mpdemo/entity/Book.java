package cn.icexmoon.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.entity
 * @ClassName : .java
 * @createTime : 2023/9/4 19:27
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Data
@TableName("tbl_book")
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
