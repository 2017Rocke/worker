package com.qf.hotel.service.impl;


import com.qf.hotel.entity.Oder;
import com.qf.hotel.entity.Room;
import com.qf.hotel.mapper.IOderMapper;
import com.qf.hotel.mapper.IRoomMapper;
import com.qf.hotel.service.IOderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.util.List;
@Service
public class OderServiceImpl implements IOderService {
    @Resource
    IOderMapper iOderMapper;
    @Override
    public int addOder(Oder oder) {
        return iOderMapper.addOder(oder);
    }


    //分页展示之所有订单
    //总条数
    @Override
    public int findTotalCount01() {
        return iOderMapper.findTotalCount01();
    }
    //当前页面 订单
    @Override
    public List findList01(int offset, int pageSize) {
        return iOderMapper.findList01(offset,pageSize);
    }

    @Override
    public int findTotalCount02() {
        return iOderMapper.findTotalCount02();
    }

    @Override
    public List findList02(int offset, int pageSize) {
        return iOderMapper.findList02(offset,pageSize);
    }

    @Override
    public int findTotalCount03() {
        return iOderMapper.findTotalCount03();
    }

    @Override
    public List findList03(int offset, int pageSize) {
        return iOderMapper.findList03(offset,pageSize);
    }

    @Override
    public int findTotalCount04() {
        return iOderMapper.findTotalCount04();
    }

    @Override
    public List findList04(int offset, int pageSize) {
        return iOderMapper.findList04(offset,pageSize);
    }

    @Override
    public int findTotalCount05() {
        return iOderMapper.findTotalCount05();
    }

    @Override
    public List findList05(int offset, int pageSize) {
        return iOderMapper.findList05(offset,pageSize);
    }


    //修改订单
    @Override
    public Oder getOderClassById(int id) {
        return iOderMapper.getOderClassById(id);
    }

    @Override
    public int changeOderClass(Oder oder) {
        return iOderMapper.changeOderClass(oder);
    }
    //删除订单
    @Override
    public int deleteOder(int id) {
        return iOderMapper.deleteOder(id);
    }
    //取消订单
    @Override
    public int cancelOder(int id) {
        return iOderMapper.cancelOder(id);
    }


}
