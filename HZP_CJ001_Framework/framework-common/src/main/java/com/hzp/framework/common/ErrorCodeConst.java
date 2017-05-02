package com.hzp.framework.common;

/**
 * 类 编 号：
 * 类 名 称：ErrorCodeConst
 * 内容摘要：错误码常量定义
 * 创建日期：2016/11/22
 * 编码作者：
 */
public interface ErrorCodeConst
{

    //系统异常
    String SERVER_RESEST_EXCEPTION = "100061";//服务调用服务异常

    //DAO操作异常
    String DAO_EXCEPTION = "100030";
    String DAO_SAVE_EXCEPTION = "100031";
    String DAO_DELETE_EXCEPTION = "100032";
    String DAO_UPDATE_EXCEPTION = "100033";
    String DAO_GET_EXCEPTION = "100034";

    String SAVE_EXCEPTION = "100041";
    String DELETE_EXCEPTION = "100042";
    String UPDATE_EXCEPTION = "100043";
    String GET_EXCEPTION = "100044";

    String PROCEDURE_EXCEPTION = "100045";


    //=========== 登录模块错误码start===================
    String VALIDATE_CODE_NOT_NULL = "180000";
    //=========== 登录模块错误码end===================

    //=========== 用户模块错误码start===================
    String USER_NO_NOT_NULL = "190100";
    String PHONE_NOT_NULL = "190101";
    //=========== 用户模块错误码end===================

    //=========== 分区错误码start===================
    String STREET_NOT_NULL = "650001";
    String STREET_OCCUPIED = "650002";

    //=========== 分区错误码end===================

    //=========== DISPATCH错误码start===================
    String ERROR_600001 = "600001";//session超时
    String ERROR_600002 = "600002";//没有选择上传的图片
    String ERROR_600003 = "600003";//文件上传失败
    String ERROR_600004 = "600004";//文件上传失败
    String REQ_SERVER_EXCEPTION = "600005";//服务请求异常
    String ERROR_FTP_CONNECT_FAILD = "600006";
    String ERROR_FTP_LOGIN_FAILD = "600007";
    String ERROR_FTP_FILETYPE_FAILD = "600008";
    String ERROR_FTP_WORKINGDIR_FAILD = "600009";
    String ERROR_FTP_UPLOAD_FAILD = "600010";
    String ERROR_FTP_DOWNLOAD_FAILD = "600011";
    //=========== ftp上传错误码start===================

    //=========== ftp上传错误码end===================
    //=========== DISPATCH错误码end===================

}
