/*
 * BeanFactoryTest.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

import com.hellxing.spring.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author yuxing
 *
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad() {
        final BeanFactory beanFactory =
                new XmlBeanFactory(new ClassPathResource("beanTest.xml"));
        final HelloService helloService = beanFactory.getBean(HelloService.class);
        System.out.println(helloService.sayHello());
    }
}
