package com.company1;

public class CorrectTheMistakesOfTheCharacter {
/*    static String[][] arr = {{"5","S"}, {"0", "O"}, {"1","I"}};
    public static String correct(String string) {
        return corrected(0, string);
    }
    public static String corrected(int index, String str) {
        if (index == 2) return str.replaceAll(arr[2][0], arr[2][1]);
        return corrected(index+1, str.replaceAll(arr[index][0], arr[index][1]));
    }*/
    public static String correct(String string) {
        return string.replace("5","S")
                .replace("0", "O")
                .replace("1","I");
    }
}
