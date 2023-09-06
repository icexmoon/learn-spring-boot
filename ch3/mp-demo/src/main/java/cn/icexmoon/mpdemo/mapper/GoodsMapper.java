package cn.icexmoon.mpdemo.mapper;

import cn.icexmoon.mpdemo.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/5 21:33
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    @Update("update tb_goods set num=num-1 where id=#{id} and del_flag=0")
    void numDecrease(long id);
}
