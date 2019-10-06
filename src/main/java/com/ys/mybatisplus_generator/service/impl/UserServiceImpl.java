package com.ys.mybatisplus_generator.service.impl;

import com.ys.mybatisplus_generator.bean.User;
import com.ys.mybatisplus_generator.mapper.UserMapper;
import com.ys.mybatisplus_generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuaiyu
 * @since 2019-10-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
