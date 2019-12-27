package com.qf.hotel.service;

import com.qf.hotel.entity.Oder;
import com.qf.hotel.entity.Room;
import org.apache.ibatis.annotations.Param;

import java.sql.ResultSet;
import java.util.List;

public interface IOderService {

    //下订单
    int addOder(Oder oder);


    //分页展示
    //所有订单的总条数 getInt(1)
    int findTotalCount01();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList01(int offset, int pageSize);

    //分页展示
    //正在进行的订单的总条数 getInt(1)
    int findTotalCount02();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList02(int offset,int pageSize);

    //分页展示
    //已删除的订单的总条数 getInt(1)
    int findTotalCount03();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList03(int offset,int pageSize);

    //分页展示
    //已取消的订单的总条数 getInt(1)
    int findTotalCount04();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList04(int offset,int pageSize);

    //分页展示
    //已完成的订单的总条数 getInt(1)
    int findTotalCount05();
    //获取当前页的订单list  offset为：（当前页数-1）*展示条数 pageSize为： 展示条数
    List findList05(int offset,int pageSize);


    //修改个人订单页面
    //获取个人订单页面
    Oder getOderClassById(int id);
    //更改个人订单信息
    int changeOderClass(Oder oder);
    //删除个人订单信息
    int deleteOder(int id);
    //取消订单
    int cancelOder(int id);

}
