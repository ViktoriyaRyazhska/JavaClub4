package Basic;
/*
    In this simple assignment you are given a number
    and have to make it negative. But maybe
    the number is already negative?
*/

public class ReturnNegative {
    public static int makeNegative(final int x) {
        if (x > 0){
            return x - (x * 2);
        } else {
            return x;
        }
    }
}
