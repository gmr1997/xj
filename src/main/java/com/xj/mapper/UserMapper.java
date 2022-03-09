package com.xj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    // 通过标题分页查找
    IPage<User> selectByTitlePage(Page<User> page, String title, List<String> provinceIds);

    // 通过联系方式分页查询(qq，微信，电话)
    IPage<User> selectByContactPage(Page<User> page, String contact, List<String> provinceIds);

    // 通过位置(模糊查询地址)分页查询
    IPage<User> selectByLocationPage(Page<User> page, String location, List<String> provinceIds);
}
