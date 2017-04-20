/**
 * 
 */
package com.hzp.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 物流状态
 * @author wjw 2016-11-26
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum LgsStatus
{
    LGS_DEFAULT("未出库"),LGS_PENDING("协调中"),LGS_SENDING("发货中"),LGS_FINISH("已完成");
    private String name;
    LgsStatus(String name){
        this.setName(name);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
