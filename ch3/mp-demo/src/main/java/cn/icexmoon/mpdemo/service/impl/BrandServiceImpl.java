package cn.icexmoon.mpdemo.service.impl;

import cn.icexmoon.mpdemo.dto.BrandQueryDTO;
import cn.icexmoon.mpdemo.entity.Brand;
import cn.icexmoon.mpdemo.mapper.BrandMapper;
import cn.icexmoon.mpdemo.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mp-demo
 * @Package : cn.icexmoon.mpdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/9/5 12:12
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> query(BrandQueryDTO dto) {
        LambdaQueryWrapper<Brand> qw = new LambdaQueryWrapper<>();
        if (dto.getMinOrder() != null) {
            qw.ge(Brand::getOrdered, dto.getMinOrder());
        }
        if (dto.getMaxOrder() != null) {
            qw.le(Brand::getOrdered, dto.getMaxOrder());
        }
        if (dto.getBrandName() != null) {
            qw.like(Brand::getBrandName, dto.getBrandName());
        }
        if (dto.getStatus() != null) {
            qw.eq(Brand::getStatus, dto.getStatus());
        }
        return brandMapper.selectList(qw);
    }

    @Override
    public List<Brand> query2(BrandQueryDTO dto) {
        LambdaQueryWrapper<Brand> qw = new LambdaQueryWrapper<>();
        qw.ge(dto.getMinOrder() != null, Brand::getOrdered, dto.getMinOrder());
        qw.le(dto.getMaxOrder() != null, Brand::getOrdered, dto.getMaxOrder());
        qw.like(dto.getBrandName() != null, Brand::getBrandName, dto.getBrandName());
        qw.eq(dto.getStatus() != null, Brand::getStatus, dto.getStatus());
        return brandMapper.selectList(qw);
    }
}
