package com.qf.hotel.controller.OderController;

import com.qf.hotel.entity.Page;
import com.qf.hotel.service.IOderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/pageController")
public class PageController {
    @Resource
    IOderService oderService;
    //currentPage为当前页  pageCount为总页数

    //当前页,所有订单
    @RequestMapping("/path01")
    public Page path01(String currentPage) {
        int c=Integer.parseInt(currentPage);
        //创建page实体
        Page page = new Page();
        //每页展示的数据行
        page.setPageSize(2);
        int pageSize=page.getPageSize();
        //总条路
        int totalCount=oderService.findTotalCount01();
        //每页展示的数据集合 oder+room+user
        List list=oderService.findList01((c-1)*pageSize,pageSize);
        page.setTotalCount(totalCount);
        page.setList(list);
        int pageCount=totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        page.setPageCount(pageCount);
        page.setCurrentPage(c);
        return page;
    }
    //正在进行的订单
    @RequestMapping("/path02")
    public Page path02(String currentPage) {
        int c=Integer.parseInt(currentPage);
        //创建page实体
        Page page = new Page();
        //每页展示的数据行
        page.setPageSize(2);
        int pageSize=page.getPageSize();
        //总条路
        int totalCount=oderService.findTotalCount02();
        //每页展示的数据集合 oder+room+user
        List list=oderService.findList02((c-1)*pageSize,pageSize);
        page.setTotalCount(totalCount);
        page.setList(list);
        int pageCount=totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        page.setPageCount(pageCount);
        page.setCurrentPage(c);
        return page;
    }
    //入住中的订单
    @RequestMapping("/path03")
    public Page path03(String currentPage) {
        int c=Integer.parseInt(currentPage);
        //创建page实体
        Page page = new Page();
        //每页展示的数据行
        page.setPageSize(2);
        int pageSize=page.getPageSize();
        //总条路
        int totalCount=oderService.findTotalCount03();
        //每页展示的数据集合 oder+room+user
        List list=oderService.findList03((c-1)*pageSize,pageSize);
        page.setTotalCount(totalCount);
        page.setList(list);
        int pageCount=totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        page.setPageCount(pageCount);
        page.setCurrentPage(c);
        return page;
    }
    //已取消的订单
    @RequestMapping("/path04")
    public Page path04(String currentPage) {
        int c=Integer.parseInt(currentPage);
        //创建page实体
        Page page = new Page();
        //每页展示的数据行
        page.setPageSize(2);
        int pageSize=page.getPageSize();
        //总条路
        int totalCount=oderService.findTotalCount04();
        //每页展示的数据集合 oder+room+user
        List list=oderService.findList04((c-1)*pageSize,pageSize);
        page.setTotalCount(totalCount);
        page.setList(list);
        int pageCount=totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        page.setPageCount(pageCount);
        page.setCurrentPage(c);
        return page;
    }
    //已完成的订单
    @RequestMapping("/path05")
    public Page path05(String currentPage) {
        int c=Integer.parseInt(currentPage);
        //创建page实体
        Page page = new Page();
        //每页展示的数据行
        page.setPageSize(2);
        int pageSize=page.getPageSize();
        //总条路
        int totalCount=oderService.findTotalCount05();
        //每页展示的数据集合 oder+room+user
        List list=oderService.findList05((c-1)*pageSize,pageSize);
        page.setTotalCount(totalCount);
        page.setList(list);
        int pageCount=totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        page.setPageCount(pageCount);
        page.setCurrentPage(c);
        return page;
    }


}
