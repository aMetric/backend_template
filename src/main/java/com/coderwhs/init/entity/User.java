package com.coderwhs.init.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.coderwhs.init.enums.StatusEnum;
import lombok.Data;

@Data
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private StatusEnum status; // 使用枚举

    @TableLogic
    private Integer deleted; // 0=正常 1=逻辑删除
}
