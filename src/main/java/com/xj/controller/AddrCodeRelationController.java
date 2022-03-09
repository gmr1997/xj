package com.xj.controller;

import com.xj.service.AddrCodeRelationService;
import com.xj.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddrCodeRelationController {

    @Autowired
    AddrCodeRelationService addrCodeRelationService;

    /**
     * 查询所有省信息
     * @return
     */
    @GetMapping("/addr/selectAllProvinces")
    public ResultVO selectAllProvinces(){
        return new ResultVO(200, "", this.addrCodeRelationService.selectAllProvinces());
    }

    /**
     * 查询所有市信息
     * @return
     */
    @GetMapping("/addr/selectAllCities")
    public ResultVO selectAllCities(){
        return new ResultVO(200, "", this.addrCodeRelationService.selectAllCities());
    }
}
