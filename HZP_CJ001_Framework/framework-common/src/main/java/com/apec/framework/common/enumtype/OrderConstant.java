package com.apec.framework.common.enumtype;

public interface OrderConstant
{

    /**
     * 新订单
     */
    public static final int ORDER_STATUS_NEW = 1;

    /**
     * 处理中成功
     */
    public static final int ORDER_STATUS_PENDING = 2;

    /**
     * 完结
     */
    public static final int ORDER_STATUS_FINISHED = 3;

    /**
     * 取消
     */
    public static final int ORDER_STATUS_CANCEL = 4;
    
    public static final String ORDER_INFO_STATUS_NORMAL="N";
    
    public static final String ORDER_INFO_STATUS_RMA="B";

      
    /**
     * 退换补单
     */
    public static final String DETAIL_STATUS_RMA = "2";
    
    
    /**
     * 客服修改
     */
    public static final String DETAIL_STATUS_NORMAL = "1";
    
    /**
     * 客服修改
     */
    public static final String DETAIL_STATUS_CSMODIFY = "2";
    
    /**
     * 客服修改
     */
    public static final String DETAIL_STATUS_BACK = "3";
    /**
     * 换货
     */
    public static final String DETAIL_STATUS_REPLACE = "4";

}
