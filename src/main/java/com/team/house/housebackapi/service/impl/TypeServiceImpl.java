package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.dao.TypeMapper;
import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.entity.TypeExample;
import com.team.house.housebackapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeServiceImpl
 * @Description TODO
 * @Date 2020/6/5 15:40
 * @Created by Administrator
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired(required = false)
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllType() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
