package cn.icexmoon.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.entity
 * @ClassName : .java
 * @createTime : 2023/9/5 10:49
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 品牌
 */
@Data
public class Brand {
    private Long id;
    private String brandName;
    private String companyName;
    @TableField(select = false)
    private Integer ordered;
    @TableField("company_desc")
    private String description;
    private Integer status;
    @TableField(exist = false)
    private boolean online = true;
    private Integer delFlag;
}
