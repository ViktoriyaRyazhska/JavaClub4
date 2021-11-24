package string;

import javax.imageio.stream.ImageInputStream;

public class Stirng_Task_8 {

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            char first = one.charAt(i);
            result += first;
            char second = two.charAt(i);
            result += second;
            char third = three.charAt(i);
            result += third;
        }
        return result;
    }

    public void info(){
        System.out.println("task 2");
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }

}





