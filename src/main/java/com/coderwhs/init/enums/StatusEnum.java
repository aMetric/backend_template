package com.coderwhs.init.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    @EnumValue
    ENABLE(1, "启用"),

    @EnumValue
    DISABLE(0, "禁用");

    private final int code;
    private final String desc;
}
