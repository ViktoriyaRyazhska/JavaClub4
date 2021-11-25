package string;

public class String_Task_14 {
    public static int strCount(String str, char letter) {
        str.toLowerCase();
        int counter = 0;
        char [] arr = str.toCharArray();
        if(str.length() == 0) {
            return 0;
        }else for (int i = 0; i < arr.length; i++) {
            if(arr[i] == letter) {
                counter++;
            }
        }
        return counter;
    }
}
