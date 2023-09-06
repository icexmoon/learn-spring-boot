package cn.icexmoon.mpdemo.service.impl;

import cn.icexmoon.mpdemo.entity.Book;
import cn.icexmoon.mpdemo.mapper.BookMapper;
import cn.icexmoon.mpdemo.service.BookService;
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
 * @createTime : 2023/9/4 19:30
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(int id) {
        return bookMapper.selectById(id);
    }
}
