package cn.icexmoon.mybatisdemo.service;

import cn.icexmoon.mybatisdemo.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/4 15:47
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class BookServiceTests {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetBookById(){
        Book book = bookService.getBookById(2);
        System.out.println(book);
    }
}
