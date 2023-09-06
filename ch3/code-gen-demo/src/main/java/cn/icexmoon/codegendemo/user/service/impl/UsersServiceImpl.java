package cn.icexmoon.codegendemo.user.service.impl;

import cn.icexmoon.codegendemo.user.entity.Users;
import cn.icexmoon.codegendemo.user.mapper.UsersMapper;
import cn.icexmoon.codegendemo.user.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author icexmoon@qq.com
 * @since 2023-09-06
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
