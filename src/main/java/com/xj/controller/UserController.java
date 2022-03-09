package com.xj.controller;

import com.xj.service.UserService;
import com.xj.vo.QueryDTO;
import com.xj.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 通过用户信息分页查询
     * @param queryDTO
     * @return
     */
    @PostMapping("/user/selectByUserInfoPage")
    public ResultVO selectByUserInfoPage(@RequestBody QueryDTO queryDTO){
        return new ResultVO(200, "", this.userService.selectByUserInfoPage(queryDTO));
    }

}
