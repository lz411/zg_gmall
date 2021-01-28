package com.bj.zg.gmall.user.service.impl;

import com.bj.zg.gmall.user.bean.User;
import com.bj.zg.gmall.user.bean.UserReceiveAddress;
import com.bj.zg.gmall.user.mapper.UserMapper;
import com.bj.zg.gmall.user.mapper.UserReceiveAddressMapper;
import com.bj.zg.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 27日 5:08分
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<User> queryUsers() {
        return userMapper.queryUsers();
    }

    @Override
    public User queryById(Long id) {
        List<User> list =  userMapper.selectAll();
        User user  = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<UserReceiveAddress> queryAddressListByUserId(Long userId) {
        Example e = new Example(UserReceiveAddress.class);
        e.createCriteria().andEqualTo("userId",userId);
        List<UserReceiveAddress> list = userReceiveAddressMapper.selectByExample(e);
        return list;
    }
}
