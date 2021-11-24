package conditions;

public class Conditions_task_12 {
    public static String switchItUp(int number) {
        String result = "";
        if (number == 0) {
            result = "Zero";
        }
        if (number == 1) {
            result = "One";
        }
        if (number == 2) {
            result = "Two";
        }
        if (number == 3) {
            result = "Three";
        }
        if (number == 4) {
            result = "Four";
        }
        if (number == 5) {
            result = "Five";
        }
        if (number == 6) {
            result = "Six";
        }
        if (number == 7) {
            result = "Seven";
        }
        if (number == 8) {
            result = "Eight";
        }
        if (number == 9) {
            result = "Nine";
        }
        if (number == 10) {
            result = "Ten";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(switchItUp(5));
    }
}
