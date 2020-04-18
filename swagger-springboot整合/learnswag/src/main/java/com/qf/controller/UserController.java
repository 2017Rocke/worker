package com.qf.controller;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.qf.Dao.UserDao;
import com.qf.Entity.User;
import com.qf.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 16:21
 * @since
 */
@RestController
public class UserController {
    @Resource
    private UserService userServiceImpl;

    @GetMapping("/SelectAll")
    @ApiOperation(value="获取所有的用户对象的列表")
    public List<User> selectAll(){
        return userServiceImpl.findAllUser();

    }
    @PostMapping("/InsertUser")
    @ApiOperation(value="添加列表")
    public void insertUser(User user){
        userServiceImpl.insertUser(user);

    }


}
