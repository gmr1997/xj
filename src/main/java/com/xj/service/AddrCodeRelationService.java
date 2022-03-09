package com.xj.service;

import com.xj.entity.AddrCodeRelation;

import java.util.List;

public interface AddrCodeRelationService {
    /**
     * 查询所有省份
     * @return
     */
    List<AddrCodeRelation> selectAllProvinces();

    /**
     * 查询所有城市
     * @return
     */
    List<AddrCodeRelation> selectAllCities();
}
