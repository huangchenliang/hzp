package com.hzp.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum PickWay
{
    
    PICK_NULL("未设定"),
    PICK_LGS("物流送货"),
    PICK_SELF_WHS("仓库自提"),
    PICK_SELF_DIR("厂家直送");
    
    String name;
    PickWay(String name)
    {
        this.name=name;
    }
}
