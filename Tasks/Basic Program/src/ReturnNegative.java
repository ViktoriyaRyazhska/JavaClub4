public class ReturnNegative {
    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        }
        return -x;
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter your age:\n> ");
        int age = scanner.nextInt();
        if (minAge(age) == -1 || maxAge(age) == -1) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + output(age));
        }
    }
}
