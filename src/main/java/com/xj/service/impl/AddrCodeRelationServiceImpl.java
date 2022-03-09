package com.xj.service.impl;

import com.xj.entity.AddrCodeRelation;
import com.xj.mapper.AddrCodeRelationMapper;
import com.xj.service.AddrCodeRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddrCodeRelationServiceImpl implements AddrCodeRelationService {

    @Autowired
    AddrCodeRelationMapper addrCodeRelationMapper;

    @Override
    public List<AddrCodeRelation> selectAllProvinces() {
        return addrCodeRelationMapper.selectAllProvinces();
    }

    @Override
    public List<AddrCodeRelation> selectAllCities() {
        return addrCodeRelationMapper.selectAllCities();
    }
}
