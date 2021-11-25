package string;

public class String_Task_2 {
    public static String solution(String str) {
        char [] arr = str.toCharArray();
        String newstr = "";
        int counter = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            newstr+= arr[counter];
            counter--;
        }
        return newstr;
    }
}
