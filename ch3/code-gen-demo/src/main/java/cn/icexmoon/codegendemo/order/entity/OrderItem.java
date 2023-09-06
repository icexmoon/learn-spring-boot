package cn.icexmoon.codegendemo.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author icexmoon@qq.com
 * @since 2023-09-06
 */
@Getter
@Setter
@TableName("order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer orderId;

    private Integer itemId;

    private Integer num;

    private Integer price;

    private Boolean delFlag;


}
