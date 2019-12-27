package com.qf.hotel.mapper;

import com.qf.hotel.entity.Oder;
import com.qf.hotel.entity.Room;
import org.apache.ibatis.annotations.Param;

import java.sql.ResultSet;
import java.util.List;

public interface IOderMapper {

    //添加订单
    int addOder(@Param("oder") Oder oder);


    //分页展示
    //所有订单的总条数 getInt(1)
    int findTotalCount01();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList01(@Param("offset")int offset,@Param("pageSize")int pageSize);
    //分页展示
    //正在进行的订单的总条数 getInt(1)
    int findTotalCount02();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList02(@Param("offset")int offset,@Param("pageSize")int pageSize);
    //分页展示
    //已删除的订单的总条数 getInt(1)
    int findTotalCount03();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList03(@Param("offset")int offset,@Param("pageSize")int pageSize);
    //分页展示
    //已取消的订单的总条数 getInt(1)
    int findTotalCount04();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList04(@Param("offset")int offset,@Param("pageSize")int pageSize);
    //分页展示
    //已完成的订单的总条数 getInt(1)
    int findTotalCount05();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList05(@Param("offset")int offset,@Param("pageSize")int pageSize);





    //修改个人信息
    //获取个人表单信息展示
    Oder getOderClassById(@Param("id") int id);
    //修改个人表单信息
    int changeOderClass(@Param("oder")Oder oder);
    //删除表单信息
    int deleteOder(@Param("id") int id);
    //取消订单
    int cancelOder(@Param("id") int id);

}
