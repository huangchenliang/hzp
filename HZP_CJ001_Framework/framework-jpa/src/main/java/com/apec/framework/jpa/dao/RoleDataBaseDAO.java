package com.apec.framework.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/28 14:29
 * 编码作者：zhaolei
 */
public class RoleDataBaseDAO<T> implements RoleDataDAO<T> {
    @PersistenceContext
    private EntityManager em;

    Class<T> entityClass;

    public RoleDataBaseDAO() {
        this.entityClass = null;
        Class c = getClass();
        Type t = c.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            this.entityClass = (Class<T>) p[0];
        }
    }

    @Override
    public List<T> findAll(String queryId,String roleNo) {
        String sql = getSql(queryId,roleNo);
//        TypedQuery<T> query = em.createQuery(sql,entityClass);
        Query query = em.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public T findOne(String queryId, String roleNo) {
        String sql = getSql(queryId,roleNo);
        //TypedQuery<T> query = em.createQuery(sql,entityClass);
        Query query = em.createQuery(sql);
        return (T) query.getSingleResult();
    }

    private String getSql(String queryId,String roleNo){
        switch (queryId){
            case "SELECT_COUPONRULE": return "SELECT c.id,c.couponName FROM CouponRule c WHERE c.id=33";
            case "SELECT_COUPONINFO": return "SELECT buyId,ownTime FROM CouponInfo WHERE id=829499909345906688";
            default: return "";
        }
    }
}
