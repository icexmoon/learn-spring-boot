package cn.icexmoon.mpdemo.mapper;

import cn.icexmoon.mpdemo.entity.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/4 21:37
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class BookMapperTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testInsert() {
        Book book = new Book();
        book.setName("巴顿传");
        book.setType("名人传记");
        book.setDescription("巴顿将军传奇的一生");
        bookMapper.insert(book);
    }

    @Test
    public void testSelectOne() {
        Book book = bookMapper.selectById(1859473409);
        System.out.println(book);
    }

    @Test
    public void testSelectAll() {
        List<Book> books = bookMapper.selectList(null);
        books.forEach(b -> {
            System.out.println(b);
        });
    }

    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(2);
        book.setName("Spring 开发指南");
        bookMapper.updateById(book);
    }

    @Test
    public void testDelete(){
        bookMapper.deleteById(1859473409);
    }

    @Test
    public void testSelectPage(){
        IPage<Book> page = new Page<>(1, 5);
        bookMapper.selectPage(page, null);
        System.out.println("当前页码："+page.getCurrent());
        System.out.println("每页数据条数："+page.getSize());
        System.out.println("总数据条数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("当前页数据：");
        page.getRecords().forEach(System.out::println);
    }
}
