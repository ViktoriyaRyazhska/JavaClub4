package loops;

public class Loops_Task_8 {

    public static int grow(int[] x) {

        int curentNumber = 0;

        for (int i = 0; i < x.length; i++) {
            curentNumber = x[i];
        }

        for (int j = 0; j < x.length - 1; j++) {
            curentNumber = curentNumber * x[j];
        }

        return curentNumber;
    }


    public static void solveTask() {
        int[] res = {4, 1, 1, 1, 4};
        System.out.println("Given a non-empty array of integers, return the result of multiplying the values together in order.");
        System.out.println("Array = {4,1,1,1,4}");

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(grow(res));
        System.out.println("-----------");


    }
}

