package cn.icexmoon.mpdemo.mapper;

import cn.icexmoon.mpdemo.entity.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/5 21:46
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class GoodsMapperTests {
    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void testInserGoods(){
        Goods goods = new Goods();
        goods.setName("IPhone6");
        goods.setNum(1);
        goods.setPrice(5000D);
        goods.setDelFlag(0);
        goodsMapper.insert(goods);
    }
}
