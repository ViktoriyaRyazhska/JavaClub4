package tasks.string;

public class TripleTrouble {
    private static String tripleTrouble(String one, String two, String three) {
        String rez="";
        int length = one.length();
        for(int i = 0; i< length; i++){
            rez= rez.concat(one.substring(i, i+1)).concat(two.substring(i, i+1)).concat(three.substring(i, i+1));
        }
        return rez;
    }
    public void execute(String one, String two, String three){
        System.out.println(tripleTrouble(one, two, three));
    }
}
