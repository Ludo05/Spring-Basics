package com.lewis.springBasic;

import com.lewis.springBasic.Point;

import java.util.List;

public class Triangle implements Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;
/*
    private List<Point> pointList;

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    */
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
            /*
        for(Point p : pointList){
            System.out.println("Point: (" + p.getX() + ", "+p.getY() + ")");
        }
        */
        System.out.println("Drawing Triangle:");
        System.out.println("Point A (" + getPointA().getY() + "," + getPointA().getX() + ")");
        System.out.println("Point B (" + getPointB().getY() + "," + getPointB().getX() + ")" );
        System.out.println("Point C (" + getPointC().getY() + "," + getPointC().getX() + ")");


    }

    public void myInit(){
        System.out.println("Initializing beans...");
    }
}
