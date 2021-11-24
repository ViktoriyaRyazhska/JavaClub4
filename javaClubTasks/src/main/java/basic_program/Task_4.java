package basic_program;

public class Task_4 {
    public static int century(int year) {
        int century;
        int result = year % 100;

        if (result != 0) {
            century = year / 100 + 1;
        } else {
            century = year / 100;
        }
        return century;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
    }
}
