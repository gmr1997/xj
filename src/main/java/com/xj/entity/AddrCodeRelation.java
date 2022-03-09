package com.xj.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "addr_code_relation")
public class AddrCodeRelation {
    private String id;
    private String name;
    private String parentCode;
}
