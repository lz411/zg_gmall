package com.bj.zg.gmall.user.mapper;
import com.bj.zg.gmall.user.bean.User;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 27日 5:07分
 */
public interface UserMapper extends Mapper<User> {
    List<User> queryUsers();
}
