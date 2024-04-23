package com.javaprograms;

 class Shape {
 public double area() {
     return 0.0; // Default implementation, will be overridden by subclasses
 }
}

 class Circle extends Shape {
  double radius;

 public Circle(double radius) {
     this.radius = radius;
 }
 // Overriding method area
 public double area() {
     return 3.14 * radius * radius;
 }
}

class Rectangle extends Shape {
  double length;
  double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 //Overriding method area
 public double area() {
     return length * width;
 }
}
public class Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(8.1);
        Rectangle rectangle = new Rectangle(7.3, 5.9);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}

