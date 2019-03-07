package com.step.assignments.Inheritance;

public class Cylinder extends  Circle{
    private double height;

    public Cylinder(double radius,double height) {
        super(radius);
        if(height<0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        double area = super.getArea();
        return area*height;
    }

}
