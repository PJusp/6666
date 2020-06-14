package com.team.house.housebackapi.service;

import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.util.HouseCondition;
import com.team.house.housebackapi.util.PageParmeter;

/**
 * @author 王建兵
 * @Classname HouseService
 * @Description TODO
 * @Date 2020/6/5 15:39
 * @Created by Administrator
 */
public interface HouseService {
    //发布出租房
    public int addHouse(House house);

    /**
     * 查询某用户下的出租房
     * @param userid  用户编号
     * @param pageParmeter  分页的参数，页码，页大小
     * @return
     */
    public PageInfo<House> getHouseByUser(Integer userid,PageParmeter pageParmeter);

    /**
     * 删除出租房|恢复出租房
     * @param id
     * @param delState 1 表示删除   0表示恢复
     * @return
     */
    public int deleteHouse(String id,Integer delState);

    /**
     * 浏览出租房
     * @param houseCondition
     * @return  分页相关信息
     */
    public PageInfo<House> getBroswerHouse(HouseCondition houseCondition);


}
