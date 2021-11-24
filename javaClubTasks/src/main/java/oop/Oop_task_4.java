package oop;

public class Oop_task_4 {

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

}

