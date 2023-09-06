package cn.icexmoon.mpdemo.service;

import cn.icexmoon.mpdemo.dto.BrandQueryDTO;
import cn.icexmoon.mpdemo.entity.Brand;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/5 12:12
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface BrandService {
    List<Brand> query(BrandQueryDTO dto);

    List<Brand> query2(BrandQueryDTO dto);
}
