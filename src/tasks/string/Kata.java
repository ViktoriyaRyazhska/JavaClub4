package tasks.string;
public class Kata {
    private static String noSpace(final String x) {
        String rez = x.replaceAll(" ","");
        return rez;
    }
    public void execute(String x){
        System.out.println(noSpace(x));
    }
}