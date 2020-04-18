package com.qf;

import com.qf.Dao.UserDao;
import com.qf.Entity.User;
import com.qf.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class LearnswagApplicationTests {

    @Resource
    UserService userService;

    @Test
    void testFindAll() {
        List<User> all = userService.findAllUser();
        System.out.println(all.toString());
    }
    @Test
    void TestSave(){
        User user = new User(3,"liuguowei","123456","xiamen");
        userService.insertUser(user);
    }

}
