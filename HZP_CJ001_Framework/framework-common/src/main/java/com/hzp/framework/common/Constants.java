/**
 * 版权所有：版权所有(C) 2016，中农网
 * 文件编号：BL_PU6020301_Constants
 * 文件名称：Constants.java
 * 系统编号：
 * 系统名称：
 * 组件编号：ICT_CJ002
 * 组件名称：
 * 设计作者：
 * 完成日期：2016-07-14
 * 设计文档：
 * 内容摘要：框架常量定义
 */
package com.hzp.framework.common;

import java.nio.charset.Charset;

/**
 * 类 编 号：BL_PU1010202_PageJSON
 * 类 名 称：Constants
 * 内容摘要：常量定义
 * 完成日期：2016-07-14
 * 编码作者：
 */
public interface Constants
{

    String WORKER_ID = "workerId";

    String XML_HEAD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    String MAX_CONNECTIONS_PERHOST = "maxConnectionsPerHost";

    String MAX_TOTAL_CONNECTIONS = "maxTotalConnections";

    String SYSTEM_GENERATOR = "system_generator ";

    String IDENTITY = "identity";

    // 自定义ID
    String ASSIGNED = "assigned";

    String UUID = "uuid";

    // 角色搜索限定
    String ROLE_SEARCH_LIMIT = "limit";

    String USER_ID = "userId";

    // 角色拥有索引库集合
    String ROLE_SEARCH_INDEX = "indexList";

    String DEFAULT_LANG = "zh-CN";

    String EN_DEFAULT_LANG = "en-US";

    String SUCCESS = "success";

    String POST = "POST";

    String GET = "GET";

    String HTTP_COLON = "http:";

    String APPLICATION_JSON = "application/json";

    String APPLICATION_JSON_CHARSET_UTF8="application/json;charset=UTF-8";

    String DOUBLE_SLASH = "//";

    String SINGLE_SLASH = "/";

    String SYSTEM_ENCODING = "UTF-8";

    String QUESTION_MARK = "?";

    String COMMA = ",";

    String UNDERLINE = "_";

    Charset SYSTEM_CHARSET = Charset.forName( Constants.SYSTEM_ENCODING );

    String SESSION_ID = "sessionId";

    String TOKEN = "token";

    String USER_NO = "userNo"; //用户编号

    String IMAGE_ITEMS = "imageItems";//图片属性集合

    String TINY = "tiny";//页面传过来的缩略图的长,宽

    // 缓存公用key
    /**************************** 客户 ***************************/
    // 统一前缀
    String CACHE_CUSTOMER_PREFIX = "customer_";

    // 单个客户对象：id--->customer object
    String CACHE_CUSTOMER_ITEM = CACHE_CUSTOMER_PREFIX + "item";

    /**************************** 客户联系人 ***************************/
    // 统一前缀
    String CACHE_CONTACT_PREFIX = "contact_";
    // 单个客户对象：id--->customer object
    String CACHE_CONTACT_ITEM = CACHE_CONTACT_PREFIX + "item";

    /**************************** 编号NO前缀 ***************************/
    //客户编号
    String customerNo = "CU";
    //客户联系人
    String contact = "CO";
    //物流
    String LogisticsNo = "YD";
    //物流明细
    String LogisticsDetailNo = "LD";

    /**********************用户*******************************/

    String userInfoNo = "UI";

    String USER_INFO = "userInfo";

    String CACHE_USERINFO_PREFIX = "userInfo_";

    String CACHE_USERINFO_ITEM = CACHE_USERINFO_PREFIX + "item";

    String userDetailNo = "UT";

    String CACHE_USERDETAIL_PREFIX = "userDetail_";

    String CACHE_USERDETAIL_ITEM = CACHE_USERDETAIL_PREFIX + "item";

    String usrDepartmentNo = "UD";

    String CACHE_USRDEPARTMENT_PREFIX = "usrDepartment_";

    String CACHE_USRDEPARTMENT_ITEM = CACHE_USRDEPARTMENT_PREFIX + "item";

    String CLIENT_TYPE_PARAM = "_c";

    String ANDROID = "android";

    String UA = "UA";

    String IMEI = "IMEI";

    String ID = "id";

    String WEB = "web";

    String IOS = "ios";

    /**
     * 客户端重复提交参数
     */
    String CLIENT_DUPLICATE_ACT_PARAM = "_d";

    /**
     * 重复提交缓存前缀
     */
    /**
     * 重复提交键的前缀
     */
    String PREFIX_REPEAT = "repeat_";

    String REPEAT_UUID = "repeat_uuid";
    String REPEAT_KEY = "repeatKey";

    /*------------iweb中分页定义开始--------------*/
    int DEFAULT_FETCH_SIZE = 10;// 默认每页显示记录数
    int DEFAULT_START_PAGE = 1;// 默认起始页
    String DEFAULT_FETCHSIZE = "10";// 默认每页显示记录数
    String DEFAULT_RANGESTART = "1";// 默认起始页
    /*------------iweb中分页定义结束------------*/

    /********************* 客户拜访 ***********************/
    //编号
    String VISIT_RECORD_NO_PREFIX = "VR";
    //缓存前缀
    String CACHE_VISIT_RECORD_PREFIX = "visitRecord_";
    //单个对象 key:CACHE_VISIT_RECORD_ITEM + NO
    String CACHE_VISIT_RECORD_ITEM = CACHE_VISIT_RECORD_PREFIX + "item_";

    /********************* 角色菜单 ***********************/
    //缓存前缀
    String CACHE_ROLE_MENU_PREFIX = "roleMenu_";
    //单个对象 key:CACHE_ROLE_MENU_ITEM_PREFIX + NO; value:Object
    String CACHE_ROLE_MENU_ITEM_PREFIX = CACHE_ROLE_MENU_PREFIX + "item_";
    //用户角色对应的菜单树 key:CACHE_ROLE_MENU_TREE_PREFIX + roleNO; value:menu tree
    String CACHE_ROLE_MENU_TREE_PREFIX = CACHE_ROLE_MENU_PREFIX + "tree_";

    /********************* 地区 ***********************/
    //缓存前缀
    String CACHE_REGION_PREFIX = "region_";
    //单个对象 key:CACHE_REGION_ITEM_PREFIX + ID; value:Object
    String CACHE_REGION_ITEM_PREFIX = CACHE_REGION_PREFIX + "item_";
    //地区树 key:CACHE_REGION_TREE_PREFIX + id; value:region tree
    String CACHE_REGION_TREE_PREFIX = CACHE_REGION_PREFIX + "tree_";
    //子地区 key:CACHE_REGION_SON_LIST_PREFIX + pid
    String CACHE_REGION_SON_LIST_PREFIX = CACHE_REGION_PREFIX + "sonList_";

    /********************* 目录 ***********************/
    //目录前缀
    String CACHE_MENU_PREFIX = "menu_";

    String CACHE_MENU_ITEM_PREFIX = CACHE_MENU_PREFIX + "item_";

    /**************************** 物流 ***************************/
    // 统一前缀
    String CACHE_LOGISTICS_ORDER_PREFIX = "logistics_order";

    // 单个对象：id
    String CACHE_LOGISTICS_ORDER_ITEM = CACHE_LOGISTICS_ORDER_PREFIX + "wxscitem_logistics_order";

    // 物流详情统一前缀
    String CACHE_LOGISTICS_DETAIL_PREFIX = "logistics_detail";

    // 单个对象：
    String CACHE_LOGISTICS_DETAIL_ITEM = CACHE_LOGISTICS_DETAIL_PREFIX + "wxscitem_";

    /********************* 图片 ***********************/
    //编号
    String IMAGE_NO_PREFIX = "IMG";

    String CACHE_IMAGE_PREFIX = "image_";

    String CACHE_IMAGE_ITEM_PREFIX = CACHE_IMAGE_PREFIX + "item_";

    /********************* 购物车 ***********************/
    String CACHE_SHOP_CART_PREFIX = "shopcart_";
    String CACHE_SHOP_CART_ITEM = CACHE_SHOP_CART_PREFIX + "item_";

    //Lock异常
    String LOCK_EXCEPTION = "100060";
    String LOCK_EXISTS_EXCEPTION = "100061";
    String LOCK_NOT_HELD_EXCEPTION = "100062";
    String NO_SUCK_LOCK_EXCEPTION = "100063";
    /**
     * 锁前缀
     */
    String DEFAULT_LOCK_PREFIX = "apec.lock.";

    /*************支付重复推送锁************************************/
    String PREFIX_PAY_TO_XEF = "payToXef";
    String PREFIX_XEF_RETUTN_PAY = "xefReturnPay";
    String PREFIX_PAY_TO_SWIFT = "payToSwift";
    /*************支付重复推送锁************************************/
    /*************购物车添加锁************************************/
    String PREFIX_ADD_SHOPCART = "addShopcart";
    /*************购物车添加锁************************************/
}
