package cn.icexmoon.codegendemo.item.service.impl;

import cn.icexmoon.codegendemo.item.entity.Item;
import cn.icexmoon.codegendemo.item.mapper.ItemMapper;
import cn.icexmoon.codegendemo.item.service.IItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
