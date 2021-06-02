package com.southwind.mybatisplus.enums;

import com.southwind.mybatisplus.entity.Dome;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author hujunfei
 * * @date 2021/5/25
 */
@AllArgsConstructor
public enum RuleTypeEnnum {

    ADD(1,100,"添加"),
    UPDATE(2,101,"修改"),
    SELECT(3,102,"查询"),
    DELETE(4,103,"删除");


    @Getter
    private Integer type;
    @Getter
    private Integer code;
    @Getter
    private String context;

    static List<Dome> domes = new ArrayList<>();

    static {
        RuleTypeEnnum[] values = RuleTypeEnnum.values();
        for (RuleTypeEnnum value : values) {
            Dome dome = new Dome();
            dome.setCode(value.getCode());
            dome.setType(value.getType());
            dome.setContext(value.getContext());
            domes.add(dome);
        }
    }


    public static List<Dome> get() {
        return domes;
    }

    @AllArgsConstructor
    public enum Rule{

        ADD(1,100,"添加"),
        UPDATE(2,101,"修改"),
        SELECT(3,102,"查询"),
        DELETE(4,103,"删除");

        @Getter
        private Integer type;
        @Getter
        private Integer code;
        @Getter
        private String context;


    }



}
