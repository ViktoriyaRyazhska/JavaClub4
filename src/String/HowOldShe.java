package String;

import java.util.Scanner;


public class HowOldShe {
  public static int howOld(final String herOld) {
    String clear = herOld.replaceAll("\\D+","");
    int result = Integer.parseInt(clear);
    return result;
  }
}