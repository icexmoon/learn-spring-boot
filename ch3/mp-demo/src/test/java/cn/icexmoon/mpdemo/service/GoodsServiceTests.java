package cn.icexmoon.mpdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/5 21:45
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void testBuyGoods(){
        goodsService.buyGoods(1L);
        goodsService.buyGoods(1L);
    }

    @Test
    public void testBuyGoodsInTime() throws InterruptedException {
        new Thread(()->{goodsService.buyGoods(1L);}).start();
        new Thread(()->{goodsService.buyGoods(1L);}).start();
        Thread.sleep(5000);
    }
}
