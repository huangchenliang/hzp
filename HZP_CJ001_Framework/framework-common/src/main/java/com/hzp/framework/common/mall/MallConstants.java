package com.hzp.framework.common.mall;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2016-11-17 17:32
 * 编码作者：zhaolei
 */
public interface MallConstants
{

    String CACHE_SYSTEM_MALL_PREFIX = "mall_";

    String CACHE_MALL_COUPON_RULE_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "couponRule_";

    String CACHE_MALL_COUPON_RULE_ITEM_PREFIX = CACHE_MALL_COUPON_RULE_PREFIX + "item_";

    String CACHE_MALL_COUPON_NUM_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "couponNum_";

    String CACHE_MALL_COUPON_NUM_ITEM_PREFIX = CACHE_MALL_COUPON_NUM_PREFIX + "item_";

    String CACHE_MALL_COUPON_USER_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "couponUser_";

    String CACHE_MALL_PRESALE_TOTAL_NUM_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "presale_total_";
    String CACHE_MALL_PRESALE_EACH_NUM_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "presale_each_";

    /**
     * MQ
     */
    String AMQP_QUEUE_MALL_SAVE_COUPON = "queue.mall.saveCoupon";
    String AMQP_DIRECT_EXCHANGE_MALL_COUPON = "exchange.mall.coupon.direct";
    String AMQP_ROUTING_KEY_MALL_SAVE_COUPON = "ranting.key.saveCoupon";
    String AMQP_TOPIC_EXCHANGE_ORDER_STATUE = "topic.exchange.order.status";
    String AMQP_TOPIC_EXCHANGE_ORDER_STATUE_ROUTKEY = "order.status.#";
    String AMQP_QUEUE_ENTERPRISE_ORDER_STATUS = "queue.enterprise.order.status";

    /**
     * LOCK KEY
     */
    String CACHE_MALL_LOCK_PREFIX = CACHE_SYSTEM_MALL_PREFIX + "locks_";
    String CACHE_MALL_LOCK_COUPON_USER_PREFIX = CACHE_MALL_LOCK_PREFIX + "couponUser_";
    String CACHE_MALL_LOCK_PRESALE_USER_PREFIX = CACHE_MALL_LOCK_PREFIX + "presale_user_";
    String CACHE_MALL_LOCK_PRESALE_PREFIX = CACHE_MALL_LOCK_PREFIX + "presale_";

    /***订单错误***/
    String ERROR_ORDER_DEFAULT = "201001";
    String ERROR_ORDER_EMPTY = "201002";
    String ERROR_ORDER_TEMP_EMPTY = "201003";
    String ERROR_ORDER_TEMP_DATA = "201004";
    String ERROR_SHOPCAR_EMPTY = "201006";
    String ERROR_ORDER_AMOUNT = "201007";
    String ERROR_ORDER_RMA = "201008";
    String ERROR_ORDER_STATUS = "201009";
    String ERROR_CITYID_WRONG = "201011";
    String ERROR_ADDRESS_EMPTY = "201012";
    String ERROR_USERID_EMPTY = "201013";
    String ERROR_ORDER_NO_NOTNULL = "201015";
    String ERROR_LOGISTICS_STATE_NOTNULL = "201016";
    String ERROR_SENDTIME_NOTNULL = "201017";
    String ERROR_ORDERAMOUNT_NOTNULL = "201018";
    String ERROR_SALEID_NOTNULL = "201019";
    String ERROR_PAYSTATUS_NOTNULL = "201020";
    String ERROR_PAYWAY_NOTNULL = "201021";
    String ERROR_PAYTIME_NOTNULL = "201022";
    String ERROR_PAYREF_NOTNULL = "201023";
    String ERROR_ORDERSTATE_NOTNULL = "201024";
    String ERROR_ORDER_AUDITED = "201025";

    /***结算异常***/
    
    
    String ERROR_DISCOUNT_DATA = "201100";
    String ERROR_DISCOUNT_SKU = "201101";
    String ERROR_DISCOUNT_AMOUNT = "201101";
    String ERROR_USER_LEVEL = "201102";
    String ERROR_DISCOUNT_NOTIFY = "201103";
    
    String ERROR_COUPON_NONAVALIABLE = "201200";

    String ERROR_PAY_STATUS = "201300";

    //秒杀，已售完
    String ERROR_SECKILL_SOLD_OUT = "201400";
    //秒杀，只能获取一个
    String ERROR_SECKILL_ONLY_GET_ONE = "201401";

    //预售

    /**
     * 已处理
     */
    String ERROR_RMA_PROCESSED = "570001";

    /**
     * 退换货数量超出，不能申请
     */
    String ERROR_RMA_NUMBER_OUT = "570002";

    /**
     * 物流
     */
    String ERROR_LOGISTICS_DATA_EMPTY ="640001";
    
    static final String SYS_USER="1";
}
