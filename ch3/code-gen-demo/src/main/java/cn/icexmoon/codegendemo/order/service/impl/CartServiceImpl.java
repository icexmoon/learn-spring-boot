package cn.icexmoon.codegendemo.order.service.impl;

import cn.icexmoon.codegendemo.order.entity.Cart;
import cn.icexmoon.codegendemo.order.mapper.CartMapper;
import cn.icexmoon.codegendemo.order.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
