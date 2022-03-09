package com.xj.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO {
    //响应码
    private Integer code;
    //信息
    private String message;
    //返回数据
    private Object data;
}
