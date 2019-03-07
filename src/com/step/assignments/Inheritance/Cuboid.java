package com.step.assignments.Inheritance;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length,double height) {
        super(width, length);

        if(height<0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        double area = super.getArea();
        return  area*this.height;
    }
}
