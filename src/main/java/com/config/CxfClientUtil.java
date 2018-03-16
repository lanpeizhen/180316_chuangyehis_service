package com.config;

import com.domain.RequestBean;
import com.chuangye.service.BsServiceSoap;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Administrator on 2018/3/13.
 */
public class CxfClientUtil {
    private static  final Logger log = LoggerFactory.getLogger(CxfClientUtil.class);
           /**
         * 方式1.代理类工厂的方式,需要拿到对方的接口
         */
        public  String cl1(RequestBean bean, String serviceUrl) {
            try {
                // 代理工厂
                JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
                // 设置代理地址
                jaxWsProxyFactoryBean.setAddress(serviceUrl);
                // 设置接口类型
                jaxWsProxyFactoryBean.setServiceClass(BsServiceSoap.class);
                // 创建一个代理接口实现
                BsServiceSoap cs = (BsServiceSoap) jaxWsProxyFactoryBean.create();
                // 数据准备
                JAXBContext jbt = JAXBContext.newInstance(RequestBean.class);

                Marshaller ms = jbt.createMarshaller();
                StringWriter writer = new StringWriter();
                ms.marshal(bean, writer);
                log.info(writer.toString());
                // 调用代理接口的方法调用并返回结果
                String result =  cs.runservice("ayk_insertfymx", writer.toString());
                System.out.println(writer.toString());
                return result;

            } catch (Exception e) {
                e.printStackTrace();
            }
            return
                     null;
        }

    public <T> T converyToJavaBean(String xml, Class<T> c) {
        T t = null;
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            t = (T) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }
}


