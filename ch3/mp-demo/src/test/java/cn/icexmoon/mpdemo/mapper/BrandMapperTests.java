package cn.icexmoon.mpdemo.mapper;

import cn.icexmoon.mpdemo.entity.Brand;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.mapper
 * @ClassName : .java
 * @createTime : 2023/9/5 10:51
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SpringBootTest
public class BrandMapperTests {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BrandMapper brandMapper;

    @Test
    public void testBrandQuery() {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.gt("ordered", 10);
        List<Brand> brands = brandMapper.selectList(qw);
        System.out.println(brands);
    }

    @Test
    public void testBrandQuery2() {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.lambda().gt(Brand::getOrdered, 10);
        List<Brand> brands = brandMapper.selectList(qw);
        System.out.println(brands);
    }

    @Test
    public void testBrandQuery3() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.gt(Brand::getOrdered, 10);
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testBrandQuery4() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.gt(Brand::getOrdered, 50)
                .or()
                .lt(Brand::getOrdered, 30);
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testBrandQuery5() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.gt(Brand::getOrdered, 10)
                .lt(Brand::getOrdered, 90);
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testBrandQuery6() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Brand::getStatus, 1)
                .and(i -> i
                        .gt(Brand::getOrdered, 90)
                        .or()
                        .lt(Brand::getOrdered, 10));
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testSelect() {
        LambdaQueryWrapper<Brand> qw = new LambdaQueryWrapper<>();
        qw.select(Brand::getId, Brand::getBrandName, Brand::getCompanyName);
        List<Brand> brands = brandMapper.selectList(qw);
        brands.forEach(System.out::println);
    }

    @Test
    public void testSelect2() {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.select("id", "brand_name", "company_name");
        List<Brand> brands = brandMapper.selectList(qw);
        brands.forEach(System.out::println);
    }

    @Test
    public void testCount() {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.select("count(*) as count");
        List<Map<String, Object>> brands = brandMapper.selectMaps(qw);
        long count = (long) brands.get(0).get("count");
        System.out.println(count);
    }

    @Test
    public void testCount2() {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.select("count(*) as count,status");
        qw.groupBy("status");
        List<Map<String, Object>> brands = brandMapper.selectMaps(qw);
        brands.forEach(b -> {
            System.out.println(String.format("状态:%d,数目:%d", b.get("status"), b.get("count")));
        });
    }

    @Test
    public void testBetween() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.between(Brand::getOrdered, 5, 60);
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testBetween2() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.between(Brand::getOrdered, 60, 5);
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testLike() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.like(Brand::getCompanyName, "小米");
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testLike2() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.likeRight(Brand::getCompanyName, "小米");
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testLike3() {
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper<>();
        lqw.likeLeft(Brand::getCompanyName, "小米");
        List<Brand> brands = brandMapper.selectList(lqw);
        System.out.println(brands);
    }

    @Test
    public void testInsert() {
        Brand brand = new Brand();
        brand.setBrandName("宇宙");
        brand.setCompanyName("宇宙卷烟厂");
        brand.setOrdered(1);
        brand.setDescription("生产宇宙牌香烟");
        brand.setStatus(0);
        brandMapper.insert(brand);
    }

    @Test
    public void testSelectBatch() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L);
        List<Brand> brands = brandMapper.selectBatchIds(ids);
        brands.forEach(System.out::println);
    }

    @Test
    public void testDeleteBatch(){
        List<Long> ids = Arrays.asList(6L,1699029476867108866L);
        brandMapper.deleteBatchIds(ids);
    }

    @Test
    public void testLogicDelete(){
        brandMapper.deleteById(1L);
    }
}
