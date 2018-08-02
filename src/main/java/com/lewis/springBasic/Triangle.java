package com.lewis.springBasic;

import com.lewis.springBasic.Point;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointb) {
        this.pointB = pointb;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Point A (" + getPointA().getY() + "," + getPointA().getX() + ")");
        System.out.println("Point B (" + getPointB().getY() + "," + getPointB().getX() + ")" );
        System.out.println("Point C (" + getPointC().getY() + "," + getPointC().getX() + ")");
    }
}
