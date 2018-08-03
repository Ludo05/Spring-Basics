package com.lewis.springBasic;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

    Point c1;


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
        System.out.println("Drawing Circle:");
        System.out.println("Circle Cimcum ("+ c1.getX() + ", " + c1.getY() + ")");
    }
}
