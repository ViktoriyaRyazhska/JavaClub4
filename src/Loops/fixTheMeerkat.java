package loops;

import java.util.Scanner;

public class WrongEndHead {
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