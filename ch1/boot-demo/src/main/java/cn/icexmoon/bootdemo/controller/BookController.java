package cn.icexmoon.bootdemo.controller;

import cn.icexmoon.bootdemo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : boot-demo
 * @Package : cn.icexmoon.bootdemo.controller
 * @ClassName : .java
 * @createTime : 2023/9/2 16:46
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public Book getBookInfo(@PathVariable("id") Integer id){
        Book book = new Book();
        book.setId(id);
        book.setName("巴顿传");
        book.setType("人物传记");
        return book;
    }
}
