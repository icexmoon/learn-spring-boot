package cn.icexmoon.mpdemo.service;

import cn.icexmoon.mpdemo.entity.Book;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/4 19:29
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface BookService {
    Book getBookById(int id);
}
