package string;

import java.util.Scanner;


public class CharProblem {
  public static int howOld(final String herOld) {
    String clear = herOld.replaceAll("\\D+","");
    int result = Integer.parseInt(clear);
    return result;
  }
}