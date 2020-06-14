package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Users;

/**
 * @author 王建兵
 * @Classname UsersService
 * @Description TODO
 * @Date 2020/6/5 15:41
 * @Created by Administrator
 */
public interface UsersService {
    //注册业务
    public int regUser(Users users);
    //登入
    public Users Login(String username,String password);
}
