package tasks.oop;

import tasks.oop.calculator.Shape;



public class Calculator {

    public double getTotalArea(Shape... shapes) {
        double shapeSum = 0;
        for (Shape shape : shapes) {
            shapeSum += shape.getArea();
        }
        return Math.round(shapeSum * 100.0) / 100.0;
    }
}












