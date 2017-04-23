package com.hzp.framework.common.exception;

/**
 * 类 名 称：NoSuchLockException
 * 内容摘要：NOSUCHLOCK服务异常
 * 完成日期：2016-07-23
 * 编码作者：
 */
public class NoSuchLockException extends HzpRuntimeException
{

    public NoSuchLockException(String errorCode, String message)
    {
        super(errorCode, message);
    }

    public NoSuchLockException(String errorCode, Throwable ex)
    {
        super(errorCode, ex);
    }

    public NoSuchLockException(String errorCode, String message, Throwable e)
    {
        super(errorCode, message, e);
    }

    public String toString()
    {
        return super.toString();
    }
}
