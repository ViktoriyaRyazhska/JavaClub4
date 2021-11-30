package String;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        char s = name.charAt(0);
        if(s == 'R' || s == 'r'){
            return name + " plays banjo";
        }
        else{
            return name+" does not play banjo";
        }
    }
}