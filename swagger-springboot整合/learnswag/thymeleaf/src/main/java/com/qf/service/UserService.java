package com.qf.service;

import com.qf.entity.User;

import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 20:41
 * @since
 */
public interface UserService {
    List<User> findAll();
}
