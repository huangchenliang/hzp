package com.apec.framework.common.enumtype;

/**
 * 类 编 号：
 * 类 名 称：SizeLevel
 * 内容摘要：图片尺寸枚举类型
 * 创建日期：2016/10/24
 * 编码作者：
 */
public enum SizeLevel
{
    TINY( 1 ), SMALL( 2 ), MIDDLE( 3 ), LARGE( 4 );

    private int id;

    SizeLevel(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

}
