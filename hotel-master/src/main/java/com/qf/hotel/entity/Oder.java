package com.qf.hotel.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author dhj
 * @date 2019/12/19 19:12
 * @since
 */
@Data
public class Oder {
    /**
     *    id                   int not null comment '订单id',
     *    oder_code            varchar(255) comment '订单编号，用uuid完成',
     *    create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
     *    room_start           date default NULL comment '入住时间',
     *    room_end             date default NULL comment '退房时间',
     *    price                double comment '订单金额',
     *    status               int default 3 comment '订单状态1：订单已经完成0：订单被取消2：订单已经删除3：订单正在进行4已入住未退房',
     *    number_of_people     int comment '入住人数',
     *    content              varchar(255) comment '用户留言',
     *    u_id                 int comment '用户id',  设为外键关联用户(User) id字段
     *    score                double default 10 comment '订单评分',
     *    room_id              int comment '房间号',  设为外键关联房间(Room) id字段
     *    is_delete            int comment '是否删除',
     *
     */
    private Integer id;
    private String oder_code;
    private Date create_time;
    private Date room_start;
    private Date room_end;
    private Double price;
    private Integer status;
    private Integer number_of_people;
    private String content;
    private Integer u_id;
    private Integer score;
    private Integer room_id;
    private Integer is_delete;
    private String o_description;
    private Room room;
    private User user;

    public Oder() {
    }

    public Oder(Integer id, String oder_code, Date create_time, Date room_start, Date room_end, Double price, Integer status, Integer number_of_people, String content, Integer u_id, Integer score, Integer room_id, Integer is_delete, String description) {
        this.id = id;
        this.oder_code = oder_code;
        this.create_time = create_time;
        this.room_start = room_start;
        this.room_end = room_end;
        this.price = price;
        this.status = status;
        this.number_of_people = number_of_people;
        this.content = content;
        this.u_id = u_id;
        this.score = score;
        this.room_id = room_id;
        this.is_delete = is_delete;
        this.o_description = description;
    }

    public Oder(String oder_code, Date room_start, Date room_end, Double price, Integer status, Integer number_of_people, String content, Integer u_id, Integer room_id) {
        this.oder_code = oder_code;
        this.room_start = room_start;
        this.room_end = room_end;
        this.price = price;
        this.status = status;
        this.number_of_people = number_of_people;
        this.content = content;
        this.u_id = u_id;
        this.room_id = room_id;
    }

    public Oder(Date room_start, Date room_end, Double price, Integer status, Integer number_of_people, String content, Integer u_id, Integer room_id) {
        this.room_start = room_start;
        this.room_end = room_end;
        this.price = price;
        this.status = status;
        this.number_of_people = number_of_people;
        this.content = content;
        this.u_id = u_id;
        this.room_id = room_id;
    }
}
