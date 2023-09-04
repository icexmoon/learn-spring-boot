package cn.icexmoon.mybatisdemo.mapper;

import cn.icexmoon.mybatisdemo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/4 15:17
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Mapper
public interface BookMapper {
    @Select("select * from tbl_book where id=#{id}")
    Book selectById(int id);
}
