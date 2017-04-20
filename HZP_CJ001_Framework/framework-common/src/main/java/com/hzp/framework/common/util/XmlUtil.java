package com.hzp.framework.common.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/29 16:39
 * 编码作者：zhaolei
 */
public class XmlUtil {
    public static <T> T readString(Class<T> clazz, String context) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller u = jc.createUnmarshaller();
        return (T) u.unmarshal(new File(context));
    }
}
