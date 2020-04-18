package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author ljh
 * @date 2020/4/12 20:39
 * @since
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
