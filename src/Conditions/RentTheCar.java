package Conditions;

import java.util.Scanner;

public class RentTheCar {
    public static int rentalCarCost(int d) {
      if(d>=7){
          d=((d*40)-50);
          return d;
      }
      else if((d>=3)&&(d<7)){
          d=((d*40)-20);
          return d;
      }
      else{
          d=d*40;
          return d;
      }
    }
}