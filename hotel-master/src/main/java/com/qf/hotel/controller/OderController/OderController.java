package com.qf.hotel.controller.OderController;


import com.qf.hotel.entity.Oder;
import com.qf.hotel.entity.Room;
import com.qf.hotel.service.IOderService;
import com.qf.hotel.service.IRoomService;
import com.qf.hotel.service.impl.OderServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("/oderController")
public class OderController {
    @Resource
    IOderService oderService;
    @Resource
    IRoomService iRoomService;

    @RequestMapping(value = "/submitOder",method = RequestMethod.POST)
    @ResponseBody
    public Room submitOder(@RequestBody int type){
        //通过房间类型是否可以获取可用房间
        List<Room> list =iRoomService.findRoomNumByType(type);
        return list.isEmpty()?null:list.get(0);
    }


    @RequestMapping(value = "/createOder",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public int createOder(@RequestBody Oder oder/*, HttpServletRequest request*/){
        String id = "3";/*(String)request.getSession().getAttribute("id");*///在登录的时候已经把id做为属性存进了session作用域
        //订单创建
        //oder01订单编号，用uuid完成  oder_code
        String oder_code = UUID.randomUUID().toString();
        oder.setOder_code(oder_code);
        oder.setU_id(Integer.parseInt(id));
        oder.setStatus(1);
        //获取可用的房间的房间号 room_num
        //Room room =oderService.findRoomNumByType(type).get(0);
        //oder.setRoom_id(room.getRoom_num());
        //获取金额
        //oder.setPrice(room.getMoney());
        //获取用户id
        //oder.setU_id(u_id);
        //测试TEST
/*         Date date01 = new Date();
        Date date02 = new Date();
        Oder oder = new Oder( date01,date02, 999.0, 1,2, "hello", 3, 1);
        //添加订单*/
        int count =oderService.addOder(oder);

        return count;
    }




    //修改订单属性
    //首先获取对象属性进行展示
    @RequestMapping(value = "/getOderClassById",method = RequestMethod.GET)
    @ResponseBody
    public Oder getOderClassById(String id){
        Oder oder=oderService.getOderClassById(Integer.parseInt(id));
        return oder;
    }
    //修改订单信息
    @RequestMapping(value = "/changeOderClass",method = RequestMethod.POST)
    @ResponseBody
    public int changeOderClass(@RequestBody Oder oder){
        int count =oderService.changeOderClass(oder);
        return count;
    }
    //删除订单信息
    @GetMapping("/deleteOder")
    @ResponseBody
    public int deleteOder(String id){
        int count =oderService.deleteOder(Integer.parseInt(id));
        return count;
    }
    //取消订单
    @GetMapping("/cancelOder")
    @ResponseBody
    public int cancelOder(String id){
        int count =oderService.cancelOder(Integer.parseInt(id));
        return count;
    }
}
