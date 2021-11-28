package Loops;

import java.util.Scanner;

public class FixTheMeerkat {
    public static String[] fixTheMeerkat(String[] arr) {
      String[] result = new String[arr.length];
      int j = 0;
      for(int i=result.length-1; i>=0; i--){
          result[j]=arr[i];
          j++;
      }
      return result;
    }
}