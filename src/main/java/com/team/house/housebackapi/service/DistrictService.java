package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.District;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2020/6/5 15:38
 * @Created by Administrator
 */
public interface DistrictService {
    //查询所有区域
    public List<District> getAllDistrict();
}
