package test_oop;

import oop.Calculator;
import oop.Square;
import oop.Triangle;
import static org.junit.Assert.*;
import org.junit.Test;



public class Test_OOP_Task_4 {

    private Calculator sut = new Calculator();

    @Test
    public void areaOfATriangleIsBaseMultipliedByHeight() {
        double triangleBase = 6;
        double triangleHeight = 4;
        assertEquals(12, sut.getTotalArea(new Triangle(triangleBase, triangleHeight)), .0001);
    }

    @Test
    public void areaOfASquareIsSquareOfSide() {
        double side = 6;
        assertEquals(36, sut.getTotalArea(new Square(side)), .0001);
    }

    @Test
    public void areaOfARectangleIsWidthMultipliedByHeight() {
        double height = 4;
        double width = 8;
        assertEquals(32, sut.getTotalArea(new oop.Rectangle(4, 8)), .0001);
    }

    @Test
    public void areaOfACircleIsSquareOfRadiusMulitpliedByPi() {
        double radius = 3;

        assertEquals(28.27, sut.getTotalArea(new oop.Circle(radius)), .0001);
    }

    @Test
    public void totalAreaIsSumOfAreasOfDifferentShapes() {
        assertEquals(49.14, sut.getTotalArea(new oop.Rectangle(4, 2), new oop.Rectangle(3, 4), new oop.Circle(1), new Square(1), new Triangle(10, 5)), .0001);
    }

    @Test
    public void totalAreaIsRoundedTo2Decimals() {
        assertEquals(4.45, sut.getTotalArea(new oop.Rectangle(1.112, 2), new oop.Rectangle(1.111, 2)), .0001);
    }

    @Test
    public void totalAreaIs0WhenThereAreNoShapes() {
        assertEquals(0, sut.getTotalArea(), .0001);
    }
}
