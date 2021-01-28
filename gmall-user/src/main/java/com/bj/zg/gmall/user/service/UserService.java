package com.bj.zg.gmall.user.service;

import com.bj.zg.gmall.user.bean.User;
import com.bj.zg.gmall.user.bean.UserReceiveAddress;

import java.util.List;

/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 27日 5:07分
 */
public interface UserService {
    List<User> queryUsers();
    User queryById(Long id);
    List<UserReceiveAddress> queryAddressListByUserId(Long userId);
}
