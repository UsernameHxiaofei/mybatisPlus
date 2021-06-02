package com.southwind.mybatisplus.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author hujunfei
 * * @date 2021/5/20
 */
@Data
@TableName("test_user")
public class User {

    public User(Long userId, @NotBlank String userName, @NotNull Integer userAge, Integer type) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.type = type;
    }

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long userId;
    @TableField(value = "name")
    @NotBlank
    private String userName;
    @TableField(value = "age")
    @NotNull
    private Integer userAge;
    private Integer type;
}
