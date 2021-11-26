package JavaClub4.src.String;

public class Kata {

    public static String solution(String str) {
        char[] ch = str.toCharArray();
        StringBuilder rev = new StringBuilder();
        for(int i = ch.length-1; i >= 0; i--){
            rev.append(ch[i]);
        }
        return rev.toString();
    }

}