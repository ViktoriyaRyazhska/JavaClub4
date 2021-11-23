package tasks.string;
public class RemoveStringSpaces{
    private static String noSpace(final String x) {
        return x.replaceAll(" ","");
    }
    public void execute(String x){
        System.out.println(noSpace(x));
    }
}