package conditions;

import java.util.Scanner;

public class Conditions_task_10 {
    public static int enough(int cap, int on, int wait){
        if(on + wait > cap) {
            return on + wait - cap;
        }else return 0;
    }
    public static void solveTask(){
        System.out.println("This program takes three parameters (capacity of the bus, number of people in the bus,\n" +
                "number of people waiting on the bus stop) and returns 0 if it is enough places and number of\n"+
                "people that could not enter the bus if it is not");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity of the bus : ");
        int value1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number of people in the bus : ");
        int value2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number of people waiting on the bus stop : ");
        int value3 = scanner2.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(enough(value1,value2,value3));
        System.out.println("-----------");

    }
}
