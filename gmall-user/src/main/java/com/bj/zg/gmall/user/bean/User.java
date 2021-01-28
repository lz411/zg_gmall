package com.bj.zg.gmall.user.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 27日 5:06分
 */

@Data
public class User {

    @Id   //tk.mybatis 中，用于标识主键。
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //主键返回策略
    private  Long  id;
    private  Long  userLevelId;
    private  String  username;
    private  String  password;
    private  String  nickname;
    private  String  phone;
    private  int  status;
    private Date createTime;

}
