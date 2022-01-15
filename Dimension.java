/**
        *
        * @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 *         @version  11.1
        *
        */
package com.task.first;
/*
This is the POJO class which defines all the getter and setter method
for Rectangle and Circle class
Rectangle class has two attributes width and Length to calculate Area
Circle  class has attribute radius to calculate Area
 */
//POJO class
public class Dimension {
    /*
        Instance Variables for Rectangle and circle
     */
    private double width;
    private double length;
    private double radius;
    //getter method to get the width of Rectangle
    public double getWidth() {
        return width;
    }
    //setter method to set the width of Rectangle
    public void  setWidth(double width) {
        this.width = width;
    }
    //getter method to get the length of Rectangle
    public double getLength() {
        return length;
    }
    //setter method to set the length of Rectangle
    public void setLength(double length) {
        this.length = length;

    }
    //getter method to get the radius of Circle
    public double getRadius() {
        return radius;
    }
    //setter method to set the radius of Circle
    public void setRadius(double radius) {
        this.radius = radius;

    }
}
