package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.District;
import com.team.house.housebackapi.service.DistrictService;
import com.team.house.housebackapi.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictController
 * @Description TODO
 * @Date 2020/6/5 15:42
 * @Created by Administrator
 */
@RestController
@RequestMapping("/district/")
public class DistrictController {
    @Autowired(required =false)
    private DistrictService districtService;

    @RequestMapping("getDisrictData")
    public BaseResult getDisrictData(){
        List<District> list=districtService.getAllDistrict();
        return new BaseResult(200,list);
    }
}
