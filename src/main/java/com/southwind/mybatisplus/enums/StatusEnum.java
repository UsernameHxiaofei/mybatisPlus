package com.southwind.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StatusEnum {

    ENABLE(1,"启用"),
    UNABLE(0,"禁用");

    @Getter
    private Integer code;
    @Getter
    private String msg;
}
