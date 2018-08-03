package com.lewis.springBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class AppContext {

    public static void main(String[] args) {
        AbstractApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        app.registerShutdownHook();
        //Coding to Interface allows you to input a triangle or circle or any other bean which class implements shape
        //and it will run normally replacing input for each bean input.
        Shape shape = (Shape) app.getBean("circle");
        shape.draw();


    }
}
