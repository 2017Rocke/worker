package com.qf.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ljh
 * @date 2020/4/12 15:32
 * @since
 */
@Entity
@Table(name = "jpa_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户对象",description = "对应用户表")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@ApiModelProperty(name="用户id",example = "2")*/
    @Column(name = "u_id",unique = true,nullable = false)
    private Integer uid;


    @Column(name = "jpa_username",unique = false,nullable = false)
    @ApiModelProperty(name = "username",example = "zhangsan")
    private String username;

    @Column(name = "jpa_password",unique = false,nullable = false)
    private String password;

    private String addr;
}
