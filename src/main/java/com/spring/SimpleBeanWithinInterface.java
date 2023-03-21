package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import xml.SimpleBean;

public class SimpleBeanWithinInterface implements InitializingBean, DisposableBean {
    private static final String DEFAULT_NAME = "Luke";
    private String name;
    private int age = Integer.MIN_VALUE;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A bean initialization");
        if (name == null) {
            System.out.println("Using a default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            System.out.println("You must set age properties");
            throw new IllegalArgumentException("You must set age properties" + SimpleBean.class);
        }
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("The resource is dead");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }







    @Override
    public String toString() {
        return "SimpleBeanWithinInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
