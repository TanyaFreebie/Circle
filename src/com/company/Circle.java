package com.company;

public class Circle {
    //the only data we need is radius,
    float radius;

    //constructor without parameters
    public Circle(){}
    //constructor with parameters
    public Circle(float radius){
        this.radius = radius;
    }

    //getters and setters
    public float getRadius(){ return this.radius;}

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //formula of circles area is "PI*r^2
    public  float area(){
        if(radius== 0){
            System.out.println("Please do not put 0 as divisor");
            return 0;
        } else{
            return (float) (Math.PI * Math.pow(radius, 2));
        }

    }

    //formula of circles circumference is 2*PI*r
    public float circumference(){
        if(radius== 0){
            System.out.println("Please do not put 0 as divisor");
            return 0;
        } else{
            return (float) (2 *Math.PI * radius);
        }
    }

}
