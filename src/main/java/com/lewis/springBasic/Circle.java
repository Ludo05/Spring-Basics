package com.lewis.springBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Locale;


//This Component makes the class a spring bean.
@Component
public class Circle implements Shape {

    private  Point c1;

    //You can use Autowired as there is only one messageSource in the spring.xml
    @Autowired(required = true)
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getC1() {
        return c1;
    }

    //Required tells spring that this is a required member variable and needs to be fulfilled (Checks when compiling).
    //@Required
    @Resource(name = "circleBean")
    public void setC1(Point c1) {
        this.c1 = c1;
    }

    //Post construct is used to run code after a bean has been initialized.
    @PostConstruct
    public void PContruct(){
        System.out.println("Initalizing bean");
    }

    //PreDestroy is used to close bean after it has been used.
    @PreDestroy
    public void endBean(){
        System.out.println("Closing Bean");
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("intro",null,"Intro",null));
        //System.out.println("Circle Cimcum ("+ c1.getX() + ", " + c1.getY() + ")");
        //the messageSource gets the point information from the properties file and is then used to print in the draw method.
        System.out.println(this.messageSource.getMessage("circum", new Object[]{c1.getX(),c1.getY()},"Cant find points.",Locale.ENGLISH));
        System.out.println(this.messageSource.getMessage("greeting",null,"Hey", Locale.ENGLISH));
    }
}
