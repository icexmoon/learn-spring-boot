package cn.icexmoon.mybatisdemo.service;

import cn.icexmoon.mybatisdemo.entity.Book;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/4 15:44
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface BookService {
    Book getBookById(int id);
}
