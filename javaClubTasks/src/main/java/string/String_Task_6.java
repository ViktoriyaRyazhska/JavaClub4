package string;

public class String_Task_6 {
    public static String areYouPlayingBanjo(String name) {
        char [] arr = name.toCharArray();
        if(arr[0] == 'R' || arr[0] == 'r') {
            return name + " plays banjo";
        }else return name + " does not play banjo";
    }
}
