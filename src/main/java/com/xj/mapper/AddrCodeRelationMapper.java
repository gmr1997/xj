package com.xj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.entity.AddrCodeRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddrCodeRelationMapper  extends BaseMapper<AddrCodeRelation> {
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
