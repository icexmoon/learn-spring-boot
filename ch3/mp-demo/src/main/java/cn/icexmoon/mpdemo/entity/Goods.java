package cn.icexmoon.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.entity
 * @ClassName : .java
 * @createTime : 2023/9/5 21:31
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 商品
 */
@Data
public class Goods {
    private Long id;
    private String name;
    private Integer num;
    private Double price;
    private Integer delFlag;
    @Version
    private Integer version;
}
