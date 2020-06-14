package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.service.TypeService;
import com.team.house.housebackapi.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeController
 * @Description TODO
 * @Date 2020/6/5 15:44
 * @Created by Administrator
 */
@RestController
@RequestMapping("/type/")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("getTypeData")
    public BaseResult getTypeData(){
       List<Type> list=typeService.getAllType();
       return new BaseResult(200,list);
    }
}
