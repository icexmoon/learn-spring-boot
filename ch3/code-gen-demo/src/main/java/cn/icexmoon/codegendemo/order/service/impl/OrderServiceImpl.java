package cn.icexmoon.codegendemo.order.service.impl;

import cn.icexmoon.codegendemo.order.entity.Order;
import cn.icexmoon.codegendemo.order.mapper.OrderMapper;
import cn.icexmoon.codegendemo.order.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
