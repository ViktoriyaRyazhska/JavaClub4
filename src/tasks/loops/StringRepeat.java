package tasks.loops;

public class StringRepeat {

    private static String repeatStr(final int repeat, final String string) {

        return string.repeat(repeat);
    }

    public void execute(int repeat, String str){
        System.out.println(repeatStr(repeat, str));
    }
}
