package cn.icexmoon.mpdemo.service;

import cn.icexmoon.mpdemo.entity.Book;
import org.junit.jupiter.api.Assertions;
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
 * @createTime : 2023/9/4 19:32
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class BookServiceTests {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookService bookService;


    @Test
    public void testGetBookById(){
        Book book = bookService.getBookById(2);
        Assertions.assertNotNull(book);
        Assertions.assertEquals("计算机理论", book.getType());
    }
}
