package cn.icexmoon.codegendemo.item.service;

import cn.icexmoon.codegendemo.item.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : code-gen-demo
 * @Package : cn.icexmoon.codegendemo.item
 * @ClassName : .java
 * @createTime : 2023/9/6 11:59
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class ItemServiceTests {
    @Autowired
    private IItemService itemService;

    @Test
    public void testSelectAll(){
        List<Item> list = itemService.list();
        System.out.println(list);
    }

    @Test
    public void testAdd(){
        Item item = new Item();
        item.setName("IPhone6");
        item.setPrice(BigDecimal.valueOf(5000));
        item.setStore(10);
        item.setDelFlag(false);
        itemService.save(item);
    }
}
