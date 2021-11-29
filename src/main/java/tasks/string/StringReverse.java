package tasks.string;

public class StringReverse {

    private static String solution(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public void execute(String str) {
        System.out.println(solution(str));
    }
}
