package com.xj;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.entity.User;
import com.xj.mapper.AddrCodeRelationMapper;
import com.xj.mapper.UserMapper;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class XjApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AddrCodeRelationMapper addrCodeRelationMapper;

    // mybatis plus自带mapper方法
//    @Test
//    void contextLoads() {
//        val userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
//    }


    // 分页查找
    @Test
    void selectByTitlePage(){
        Integer pageNo=0;
        Integer pageSize=4;
        Page<User> page=new Page<>(pageNo,pageSize);
        List<String> list = new ArrayList<String>();
        list.add("220000");
        list.add("310000");
        IPage<User> userIPage=userMapper.selectByTitlePage(page,"子",list);
        System.out.println("开始");
        System.out.println(userIPage.getRecords());
        System.out.println("结束");
    }

    // 分页查找
    @Test
    void selectByContactPage(){
        Integer pageNo=0;
        Integer pageSize=4;
        Page<User> page=new Page<>(pageNo,pageSize);
        List<String> list = new ArrayList<String>();
        list.add("220000");
        list.add("310000");
        IPage<User> userIPage=userMapper.selectByContactPage(page,"187",list);
        System.out.println("开始");
        System.out.println(userIPage.getRecords());
        System.out.println("结束");
    }

    @Test
    void selectAllProvinces(){
        val addrCodeRelations = addrCodeRelationMapper.selectAllProvinces();
        addrCodeRelations.forEach(System.out::println);
    }
    @Test
    void selectAllCities(){
        val addrCodeRelations = addrCodeRelationMapper.selectAllCities();
        addrCodeRelations.forEach(System.out::println);
    }

}
