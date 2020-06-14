package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Type;


import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeService
 * @Description TODO
 * @Date 2020/6/5 15:40
 * @Created by Administrator
 */
public interface TypeService {
    //查询所有类型
    public List<Type> getAllType();
}
