package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Street;
import com.team.house.housebackapi.service.StreetService;
import com.team.house.housebackapi.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetController
 * @Description TODO
 * @Date 2020/6/5 15:43
 * @Created by Administrator
 */
@RestController
@RequestMapping("/street/")
public class StreetController {
    @Autowired(required =false)
    private StreetService streetService;
    //请求接收区域编号查询相应的街道
    @RequestMapping("getStreetData")
    public BaseResult getStreetData(Integer did){
        List<Street> list=streetService.getStreetByDid(did);
        return new BaseResult(200,list);
    }
}
