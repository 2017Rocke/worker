package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 20:43
 * @since
 */
@Controller
public class UserController {
    @Resource
    UserService userServiceImpl;
    @GetMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("users", userServiceImpl.findAll());
        return "user";
    }
}
