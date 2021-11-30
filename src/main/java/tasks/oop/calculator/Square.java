package tasks.oop.calculator;

public class Square extends Shape {

    private double side;

    public Square(double side) {

        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
