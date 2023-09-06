package cn.icexmoon.mpdemo.service;

import cn.icexmoon.mpdemo.dto.BrandQueryDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service
 * @ClassName : .java
 * @createTime : 2023/9/5 12:20
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class BrandServiceTests {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BrandService brandService;

    @Test
    public void testQuery(){
        BrandQueryDTO dto = new BrandQueryDTO(1, null, null, 1);
        brandService.query(dto);
    }

    @Test
    public void testQuery2(){
        BrandQueryDTO dto = new BrandQueryDTO(null, null, null, null);
        brandService.query(dto);
    }
}
