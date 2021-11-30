package Loops;

import java.util.Scanner;


public class CounterOfShips {
  public static int countSheeps(boolean[] arrayOfSheeps) {
      int count = 0;
      for (boolean arrayOfSheep : arrayOfSheeps) {
          if (arrayOfSheep) {
              count++;
          }
      }
      return count;
  }
}