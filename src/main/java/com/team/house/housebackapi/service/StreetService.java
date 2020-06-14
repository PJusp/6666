package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Street;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetService
 * @Description TODO
 * @Date 2020/6/5 15:39
 * @Created by Administrator
 */
public interface StreetService {
    //通过区域查询街道
    public List<Street> getStreetByDid(Integer did);
}
