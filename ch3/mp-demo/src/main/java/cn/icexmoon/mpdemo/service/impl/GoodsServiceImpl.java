package cn.icexmoon.mpdemo.service.impl;

import cn.icexmoon.mpdemo.entity.Goods;
import cn.icexmoon.mpdemo.mapper.GoodsMapper;
import cn.icexmoon.mpdemo.service.GoodsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/9/5 21:35
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
@Log4j2
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void buyGoods(long id) {
        Goods goods = goodsMapper.selectById(id);
        log.info("检查商品库存是否足够。");
        if (goods.getNum() <= 0) {
            throw new RuntimeException(String.format("商品%d已经卖完", id));
        }
        log.info("商品库存足够");
        try {
            Thread.sleep(1000);
            Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        log.info("执行商品库存扣减");
        // 使用乐观锁进行库存扣减
        Goods newGoods = new Goods();
        newGoods.setId(id);
        newGoods.setNum(goods.getNum() - 1);
        newGoods.setVersion(goods.getVersion());
        int rows = goodsMapper.updateById(newGoods);
        if (rows<=0){
            throw new RuntimeException("库存扣减失败");
        }
    }
}
