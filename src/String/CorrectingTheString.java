package string;

import java.util.Scanner;

public class Correct {
  public static String correct(String string) {
    string = string.replace("1", "I");
    string = string.replace("0", "O");
    string = string.replace("5", "S");
    return string;
  }
}