package com.team.house.housebackapi.service.impl;


import com.team.house.housebackapi.dao.DistrictMapper;
import com.team.house.housebackapi.entity.District;
import com.team.house.housebackapi.entity.DistrictExample;
import com.team.house.housebackapi.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictServiceImpl
 * @Description TODO
 * @Date 2020/6/5 15:38
 * @Created by Administrator
 */
@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
