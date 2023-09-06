package cn.icexmoon.codegendemo.order.service.impl;

import cn.icexmoon.codegendemo.order.entity.OrderItem;
import cn.icexmoon.codegendemo.order.mapper.OrderItemMapper;
import cn.icexmoon.codegendemo.order.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author icexmoon@qq.com
 * @since 2023-09-06
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
