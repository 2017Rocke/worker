package com.qf.service.impl;

import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 20:42
 * @since
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
