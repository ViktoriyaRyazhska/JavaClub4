package OOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public double getTotalArea() {
        return 0;
    }

    public double getTotalArea(Figure... figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getArea();
        }
        return round(sum,2);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

abstract class Figure {
    public abstract double getArea();
}

class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Figure {
    private double triangleBase;
    private double triangleHeight;

    public Triangle() {
    }

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double getArea() {
        return 0.5 * triangleBase * triangleHeight;
    }
};

