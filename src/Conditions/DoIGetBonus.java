package Conditions;

import java.util.Scanner;

public class DoIGetBonus{
    public static String bonusTime(final int salary, final boolean bonus) {
      if(bonus){
        int n = salary * 10;
        return("\u00A3"+n);
      }
      else{
        return("\u00A3"+salary);
      }
    }
  }