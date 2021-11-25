package string;

public class String_Task_18 {
    public static String remove(String s, int n){
        char [] arr = s.toCharArray();
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = s.replaceFirst("!", "");
            s = s1;
        }
        return s1;
    }
}
