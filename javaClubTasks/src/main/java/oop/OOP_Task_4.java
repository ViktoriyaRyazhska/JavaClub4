package oop;

import java.util.Scanner;

public class OOP_Task_4 {

    public static void main(String[] args) {

        Calculator sut = new Calculator();
        System.out.println(sut.getTotalArea(new Circle(3)));
        System.out.println(sut.getTotalArea(new Square(5)));
        System.out.println(sut.getTotalArea(new Rectangle(5, 5)));
        System.out.println(sut.getTotalArea(new Triangle(3, 3)));
        System.out.println(sut.getTotalArea());
        System.out.println(sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)));
        System.out.println(sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)));

    }

    public static void solveTask() {
        System.out.println("Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`");
        Calculator sut = new Calculator();
        System.out.println("getTotalArea: Circle: ");
        System.out.println(sut.getTotalArea(new Circle(3)));
        System.out.println("getTotalArea: Square: ");
        System.out.println(sut.getTotalArea(new Square(5)));
        System.out.println("getTotalArea: Rectangle: ");
        System.out.println(sut.getTotalArea(new Rectangle(5, 5)));
        System.out.println("getTotalArea: Triangle: ");
        System.out.println(sut.getTotalArea(new Triangle(3, 3)));
        System.out.println("getTotalArea: null: ");
        System.out.println(sut.getTotalArea());
        System.out.println("getTotalArea: Rectangle and Rectangle ");
        System.out.println(sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)));
        System.out.println("getTotalArea: Rectangle, Rectangle, Circle, Square, Triangle");
        System.out.println(sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)));

    }

}

