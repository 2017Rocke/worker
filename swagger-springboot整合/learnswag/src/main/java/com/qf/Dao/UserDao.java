package com.qf.Dao;

import com.qf.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ljh
 * @date 2020/4/12 15:39
 * @since
 */
public interface UserDao extends JpaRepository<User,Integer> {


}
