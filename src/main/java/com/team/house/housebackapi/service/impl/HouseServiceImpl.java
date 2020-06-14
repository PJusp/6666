package com.team.house.housebackapi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.dao.HouseMapper;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.service.HouseService;
import com.team.house.housebackapi.util.HouseCondition;
import com.team.house.housebackapi.util.PageParmeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname HouseServiceImpl
 * @Description TODO
 * @Date 2020/6/5 15:39
 * @Created by Administrator
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired(required = false)
    private HouseMapper houseMapper;

    @Override
    public int addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    @Override
    public PageInfo<House> getHouseByUser(Integer userid, PageParmeter pageParmeter) {
        //开启分页
        PageHelper.startPage(pageParmeter.getPage(),pageParmeter.getPageSize());
        //调用dao层查询所有
        List<House> list=this.houseMapper.getHouseByUser(userid);
        return new PageInfo<House>(list);
    }
    @Override
    public int deleteHouse(String id, Integer delState) {
        House house=new House();
        house.setId(id);  //设置编号
        house.setIsdel(delState);   //设置删除状态
        return this.houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public PageInfo<House> getBroswerHouse(HouseCondition houseCondition) {
        PageHelper.startPage(houseCondition.getPage(),houseCondition.getPageSize());
        List<House> list=this.houseMapper.browserHouse(houseCondition);
        return new PageInfo<House>(list);
    }
}
