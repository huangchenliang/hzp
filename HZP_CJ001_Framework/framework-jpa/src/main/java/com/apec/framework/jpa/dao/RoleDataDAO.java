package com.apec.framework.jpa.dao;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/28 14:28
 * 编码作者：zhaolei
 */
public interface RoleDataDAO<T> {

    List<T> findAll(String queryId,String roleNo);

    T findOne(String queryId,String roleNo);
}
