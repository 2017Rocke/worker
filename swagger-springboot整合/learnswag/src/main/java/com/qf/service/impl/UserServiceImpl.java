package com.qf.service.impl;

import com.qf.Dao.UserDao;
import com.qf.Entity.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 15:41
 * @since
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public void insertUser(User user) {
        userDao.saveAndFlush(user);
    }


}
