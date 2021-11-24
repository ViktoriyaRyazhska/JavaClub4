package oop;

class Square extends Figure{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

}
