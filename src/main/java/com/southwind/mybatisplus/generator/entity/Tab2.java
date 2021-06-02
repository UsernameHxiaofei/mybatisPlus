package com.southwind.mybatisplus.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author southwind
 * @since 2020-05-17
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Tab2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String tab2Id;


}
