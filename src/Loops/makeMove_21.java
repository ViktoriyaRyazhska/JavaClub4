package loops;

import java.util.Scanner;


public class Kata {
  public static int makeMove(int sticks) {
    if(sticks == 3){
      return 3;
    }
    else if(sticks == 2){
      return 2;
    }
    else if(sticks == 1){
      return 1;
    }
    return 3;
  }
}