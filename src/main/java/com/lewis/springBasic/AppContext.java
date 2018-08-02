package com.lewis.springBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) app.getBean("triangle");
        triangle.draw();
    }
}
