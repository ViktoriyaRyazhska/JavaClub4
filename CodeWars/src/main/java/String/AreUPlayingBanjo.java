package String;

public class AreUPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        String result = name;
        char[] leters = name.toCharArray();
        if(leters[0] == 'R' || leters[0] == 'r')  {
            result +=  " plays banjo";
        }else{
            result +=  " does not play banjo";
        }
        return result;
    }
}

