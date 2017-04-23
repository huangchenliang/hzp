package com.hzp.framework.common.roledata;

import com.hzp.framework.common.roledata.pojo.Param;
import com.hzp.framework.common.roledata.pojo.Role;
import com.hzp.framework.common.roledata.pojo.RoleQuery;
import com.hzp.framework.common.roledata.pojo.RoleQuerys;
import com.hzp.framework.common.util.XmlUtils;
import com.google.common.base.Strings;

import javax.xml.bind.JAXBException;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/29 16:19
 * 编码作者：zhaolei
 */
public class ParseRoleXml {

    public static RoleQuerys roleQuerys(String file) throws JAXBException {
        return XmlUtils.readString(RoleQuerys.class, file);
    }

    public static void main(String[] args) throws JAXBException {
        RoleQuerys roleQuerys = ParseRoleXml.roleQuerys("E:\\IdeaProjects\\Work3\\hhj\\Src\\APEC_CJ001_Framework\\framework-common\\src\\main\\java\\com\\apec\\framework\\common\\roledata\\xml\\role_data.xml");
        StringBuffer stringBuffer = new StringBuffer();
        for (RoleQuery roleQuery : roleQuerys.getQuerys()) {
            System.out.println("id :" + roleQuery.getId());
            System.out.println("event :" + roleQuery.getEvent());

            stringBuffer.append(roleQuery.getEvent());
            stringBuffer.append(" ");

            System.out.println("entity :" + roleQuery.getEntity());
            for (Role role : roleQuery.getRoles().getRoles()) {
                System.out.println("    role_no :" + role.getNo());
                System.out.println("    role_fields :" + role.getFields());
                if (role.getNo().equals("HHJ_ROLE_LGS_MEMBER")) {
                    stringBuffer.append(role.getFields());
                    stringBuffer.append(" ");
                    stringBuffer.append("FROM ");
                    stringBuffer.append(roleQuery.getEntity());
                    stringBuffer.append(" ");
                    stringBuffer.append("WHERE 1=1 ");

                    for (Param param : role.getParams().getParams()) {
                        System.out.println("    param_name :" + param.getName());
                        System.out.println("    param_operator :" + param.getOperator());
                        System.out.println("    param_value :" + param.getValue());
                        if (Strings.isNullOrEmpty(param.getLogical())) {
                            stringBuffer.append("AND ");
                        }else {
                            stringBuffer.append(param.getLogical());
                            stringBuffer.append(" ");
                        }

                        stringBuffer.append(param.getName()
                                + " " + param.getOperator()
                                + " " + param.getValue()
                                + " ");
                    }
                }
            }
            for (Param param : roleQuery.getParams().getParams()) {
                System.out.println("    param_name :" + param.getName());
                System.out.println("    param_operator :" + param.getOperator());
                System.out.println("    param_value :" + param.getValue());

                if (Strings.isNullOrEmpty(param.getLogical())) {
                    stringBuffer.append("AND ");
                }else {
                    stringBuffer.append(param.getLogical());
                    stringBuffer.append(" ");
                }
                stringBuffer.append(param.getName()
                        + " " + param.getOperator()
                        + " " + param.getValue()
                        + " ");
            }
            System.out.println("groupby :" + roleQuery.getGroupby());

            stringBuffer.append("GROUP BY ");
            stringBuffer.append(roleQuery.getGroupby());
            stringBuffer.append(" ");

            System.out.println("orderby-fields :" + roleQuery.getOrderby().getFields());
            System.out.println("orderby-sort :" + roleQuery.getOrderby().getSort());

            stringBuffer.append("ORDER BY ");
            stringBuffer.append(roleQuery.getOrderby().getFields());
            stringBuffer.append(" ");
            stringBuffer.append(roleQuery.getOrderby().getSort());

            System.out.println(stringBuffer.toString());
        }
    }
}
