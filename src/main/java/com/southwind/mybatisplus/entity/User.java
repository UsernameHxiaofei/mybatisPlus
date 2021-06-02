package com.southwind.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.southwind.mybatisplus.enums.AgeEnum;
import com.southwind.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "user")
public class User {
    @TableId
    private String id;
    @TableField(value = "name")
    private String title;
    private Integer age;
    @TableField(exist = false)
    private String gender;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
    @TableField(value = "status")
    private StatusEnum statusEnum;
//    @TableLogic
    private Integer deleted;
}
