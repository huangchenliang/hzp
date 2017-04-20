/**
 * 
 */
package com.hzp.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 拆分标示
 * @author wjw 2016-11-26
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum SplitFlag
{
    UN_SPLIT,SPLIT;
}
