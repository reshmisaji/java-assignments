package com.step.assignments.Inheritance;

public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius<0) {
            this.radius = 0;
            return;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
