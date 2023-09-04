package cn.icexmoon.junitdemo.service.impl;

import cn.icexmoon.junitdemo.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : junit-demo
 * @Package : cn.icexmoon.junitdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/9/4 10:15
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book has saved.");
    }
}
