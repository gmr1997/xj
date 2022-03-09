package com.xj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xj.vo.QueryDTO;
import com.xj.entity.User;

public interface UserService {
    /**
     * 通过用户信息分页查找
     * @param queryDTO
     * @return
     */
    IPage<User> selectByUserInfoPage(QueryDTO queryDTO);
}
