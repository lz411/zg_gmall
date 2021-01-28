package com.bj.zg.gmall.user.controller;

import com.bj.zg.gmall.user.bean.User;
import com.bj.zg.gmall.user.bean.UserReceiveAddress;
import com.bj.zg.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 27日 5:06分
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userService.queryUsers();
        return  users;
    }

    @RequestMapping("/queryById")
    @ResponseBody
    public User queryById(Long id){
        User user = userService.queryById(id);
        return  user;
    }

    @RequestMapping("/queryAddressListByUserId")
    @ResponseBody
    public List<UserReceiveAddress> queryAddressListByUserId(Long userId){
        List<UserReceiveAddress> list = userService.queryAddressListByUserId(userId);
        return  list;
    }
}
