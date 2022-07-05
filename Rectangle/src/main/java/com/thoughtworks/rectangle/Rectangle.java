package com.thoughtworks.rectangle;
 
public class Rectangle{
    private final double length;
    private final double breadth;
    
 public Rectangle(double length,double breadth)
 {
    this.breadth=breadth;
    this.length=length; 

 }
    double area()
    {
        double areaResult=this.length*this.breadth;
        return areaResult;
    }
    double perimeter(){
        double perimeterResult=2*(length+breadth);
        return perimeterResult; 
    }


}