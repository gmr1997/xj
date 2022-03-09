package com.xj.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName user_test
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User implements Serializable {
    private Integer id;

    private String title;

    private String age;

    private String price;

    private String project;

    private String process;

    private String qq;

    private String wechat;

    private String phone;

    private String address;

    private String dz;

    private String pid;

    private String cid;

    private String privacy;

    private String status;

    private String reason;

    private Integer browse;

    private String createTime;

    private Integer earnPoints;

    private String isAd;

    private String author;

    private String file;

    private String img;

    private String faceValue;

    private Integer viewPoints;

    private String viewList;

    private static final long serialVersionUID = 1L;
}