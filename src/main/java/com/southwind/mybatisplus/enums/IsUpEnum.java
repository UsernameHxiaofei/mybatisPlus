package com.southwind.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author hujunfei
 * * @date 2021/5/21
 */
public enum IsUpEnum {

    up(1,"上架"),
    down(2,"下架");

    IsUpEnum(Integer code, String smg) {
        this.code = code;
        this.smg = smg;
    }

    @EnumValue
    private Integer code;
    private String smg;
}
