package cn.icexmoon.test;

import cn.icexmoon.junitdemo.JunitDemoApplication;
import cn.icexmoon.junitdemo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : junit-demo
 * @Package : cn.icexmoon.junitdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/4 10:16
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest(classes = JunitDemoApplication.class)
public class BookServiceTests {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookService bookService;
    @Test
    public void testSave(){
        bookService.save();
    }
}
