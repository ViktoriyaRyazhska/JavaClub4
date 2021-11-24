package conditions;

public class Conditions_task_8 {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean flag = false;
        int men = flower1 % 2;
        int woomen = flower2 % 2;
        if (men == 0 && woomen != 0 || men != 0 && woomen == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isLove(2, 2));

    }
}
