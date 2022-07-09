package com.syntax.class26;

public class Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape {

    @Override
    public void calculateArea() {

    }

    public double calculateArea(double radius) {

        return Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {

    }

    public double calculatePerimeter(double radius) {

        return Math.PI * 2 * radius;
    }
}
class Square implements Shape {

    @Override
    public void calculateArea() {

    }

    public double calculateArea(double side) {

        return side * side;
    }

    @Override
    public void calculatePerimeter() {

    }

    public double calculatePerimeter(double side) {

        return 4 * side;
    }
}
class Test{

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Area of square is : "+square.calculateArea(20));
        System.out.println("Perimeter of square is : "+square.calculatePerimeter(20));
        Circle circle = new Circle();
        System.out.println("Area of circle is : "+circle.calculateArea(15));
        System.out.println("Perimeter of circle is : "+circle.calculatePerimeter(15));
    }
}