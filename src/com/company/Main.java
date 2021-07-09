package com.company;
// Assignment
// Write a Circle class, that takes in the radius as a field
// Create 2 constructors, one with the field as a parameter and one without.
// write methods find the circumference and area of the circle
import java.util.Scanner;

public class Main {
    //Start with creating new class Circle

    public static void main(String[] args) {
	// set up a scanner
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();// set an object

        System.out.println("Radius of a circle: ");//get data from user
        circle.setRadius(sc.nextFloat());

        //print out answers
        System.out.println("Circumference is " + circle.circumference());
        System.out.println("Area is "+ circle.area());



    }
}
