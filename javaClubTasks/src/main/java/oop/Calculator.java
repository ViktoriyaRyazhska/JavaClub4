package oop;


public class Calculator {

    public double getTotalArea(Figure...fig){
        double sum = 0;
        for(int i = 0; i < fig.length;i++){
            sum += fig[i].getArea();
        }
        return roundDouble(sum);
    }
    public double roundDouble(double d){
        d= d*100;
        int i = (int)Math.round(d);
        return (double)i/100;
    }
}



