/**
 * 
 */
package com.apec.framework.common.enumtype;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author wjw 2016-11-24
 *
 */
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum RmaStatus
{
    RMA_NONE,NORMAL, RMA_PENDING, RMA_SUCCESS, RMA_FAIL;
}
