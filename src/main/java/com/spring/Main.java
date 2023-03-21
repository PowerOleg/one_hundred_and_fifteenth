package com.spring;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("spring/lesson115-2-app.xml");
        SimpleBeanWithinInterface simpleBean1 = getBean("simpleBean1", ctx);
        SimpleBeanWithinInterface simpleBean2 = getBean("simpleBean2", ctx);
        SimpleBeanWithinInterface simpleBean3 = getBean("simpleBean3", ctx);
        ctx.close();
    }
    
    private static SimpleBeanWithinInterface getBean(String beanName, ApplicationContext ctx) {         //1 для первого варианта изменить на SimpleBean
        try {
            SimpleBeanWithinInterface bean = (SimpleBeanWithinInterface) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Error bean creation");
            return null;
        }
    }
}


//        GenericXmlApplicationContext ctx =
//                new GenericXmlApplicationContext("spring/xml/lesson115-1-app.xml");
