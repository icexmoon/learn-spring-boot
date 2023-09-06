package cn.icexmoon.mpdemo.mapper;

import cn.icexmoon.mpdemo.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/4 19:29
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
