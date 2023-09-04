package cn.icexmoon.mybatisdemo.service.impl;

import cn.icexmoon.mybatisdemo.entity.Book;
import cn.icexmoon.mybatisdemo.mapper.BookMapper;
import cn.icexmoon.mybatisdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/9/4 15:45
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class BookServiceImpl implements BookService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(int id) {
        return bookMapper.selectById(id);
    }
}
