package cn.icexmoon.mpdemo.dto;

import lombok.Value;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo
 * @ClassName : .java
 * @createTime : 2023/9/5 12:14
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 用于查询品牌的传输对象
 */
@Value
public class BrandQueryDTO {
    // 品牌顺序的最小值
    Integer minOrder;
    // 品牌顺序的最大值
    Integer maxOrder;
    // 品牌名称
    String brandName;
    // 品牌状态
    Integer status;
}
