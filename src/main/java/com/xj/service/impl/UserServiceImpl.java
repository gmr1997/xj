package com.xj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.vo.QueryDTO;
import com.xj.entity.User;
import com.xj.mapper.UserMapper;
import com.xj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public IPage<User> selectByUserInfoPage(QueryDTO queryDTO) {
        Page<User> page = new Page<>(queryDTO.getPageNo(), queryDTO.getPageSize());
        Integer queryType = queryDTO.getQueryType();
        if (2 == queryType){
            return userMapper.selectByContactPage(page, queryDTO.getKeyword(), queryDTO.getProvinceIds());
        } else if (1 == queryType) {
            return userMapper.selectByTitlePage(page, queryDTO.getKeyword(), queryDTO.getProvinceIds());
        } else if (3 == queryType) {
            return userMapper.selectByLocationPage(page, queryDTO.getKeyword(), queryDTO.getProvinceIds());
        } else {
            return userMapper.selectByTitlePage(page, queryDTO.getKeyword(), queryDTO.getProvinceIds());
        }
    }

}
