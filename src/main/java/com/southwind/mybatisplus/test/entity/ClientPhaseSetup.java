package com.southwind.mybatisplus.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author hujunfei
 * * @date 2021/5/25
 */

@TableName("crm_client_phase_setup")
public class ClientPhaseSetup {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private Long accountId;

    private Integer enable;

    private Integer stageChangeSetting;





}
