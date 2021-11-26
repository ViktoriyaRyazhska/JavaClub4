package JavaClub4.src.OOP;

public class Calculator {

    public double getTotalArea(Triangle t) {
        return t.triangleBase * t.triangleHeight / 2;
    }

    public double getTotalArea(Square s) {
        return s.side * s.side;
    }

    public double getTotalArea(Rectangle r) {
        return r.height * r.width;
    }

    public double getTotalArea(Circle c) {
        double res = Math.round(c.radius * c.radius * Math.PI * 100.0) / 100.0;
        return res;
    }

    public double getTotalArea(Rectangle r, Rectangle r2, Circle c, Square s, Triangle t) {
        double area = getTotalArea(r);
        double area2 = getTotalArea(r2);
        double area3 = getTotalArea(c);
        double area4 = getTotalArea(s);
        double area5 = getTotalArea(t);
        return area + area2 + area3 + area4 + area5;
    }

    public double getTotalArea(Rectangle r, Rectangle r2) {
        double area = r.height * r.width;
        double area2 = r2.height * r2.width;
        double res = Math.round((area + area2) * 100.0) / 100.0;
        return res;
    }

    public double getTotalArea() {
        return 0;
    }
}

class Triangle {
    double triangleBase;
    double triangleHeight;

    Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }
}

class Rectangle {
    double height;
    double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}
