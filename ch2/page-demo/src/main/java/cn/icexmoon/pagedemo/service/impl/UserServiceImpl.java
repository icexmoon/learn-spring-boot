package cn.icexmoon.pagedemo.service.impl;

import cn.icexmoon.pagedemo.entity.User;
import cn.icexmoon.pagedemo.mapper.UserMapper;
import cn.icexmoon.pagedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mvc-demo
 * @Package : cn.icexmoon.mvcdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/27 18:00
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class UserServiceImpl implements UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteById(int id) {
        userMapper.deleteById(id);
    }
}
