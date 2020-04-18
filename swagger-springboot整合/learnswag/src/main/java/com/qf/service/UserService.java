package com.qf.service;

import com.qf.Entity.User;

import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 15:40
 * @since
 */
public interface UserService {

    List<User> findAllUser();

    void insertUser(User user);
}
