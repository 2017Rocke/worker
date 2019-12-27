package com.qf.hotel.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author wei
 * @create 2019/12/19
 *
 *
 *create table room
 * (
 *    id                   int not null comment 'id',
 *    room_num             int comment '房间号',
 *    create_time          date comment '创建时间',
 *    status               int comment '房间状态0：不可以1：可用',
 *    type                 int comment '房间类型0:单人房1：双人房2：豪华套间3：总统套房4：大床房',
 *    bed                  int comment '几个床位',
 *    description          text comment '房间描述',
 *    money                double comment '房间价钱',
 *    is_delete            int comment '是否删除',
 *    primary key (id)
 * );
 *
 * alter table room comment '房间表';
 */

@Data
public class Room {

    private Integer id;
    private Integer room_num;
    private Date create_time;
    private Integer status;
    private Integer type;
    private Integer bed;
    private String r_description;
    private Double money;
    private Integer is_delete;
    private List<RoomImg> roomImgList;
}