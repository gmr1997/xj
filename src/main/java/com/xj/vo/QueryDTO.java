package com.xj.vo;

import lombok.Data;

import java.util.List;

@Data
public class QueryDTO {
    private Integer pageNo;    //页码
    private Integer pageSize;  //页面大小
    private Integer queryType; //查询类型，1：联系方式，2：关键字，3：地址关键字，空则查询所有
    private String keyword;    //关键字
    private List<String> provinceIds;
}
