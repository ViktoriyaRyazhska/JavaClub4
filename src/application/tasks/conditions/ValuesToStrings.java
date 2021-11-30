package application.tasks.conditions;

import java.util.Scanner;

public class ValuesToStrings {
    public static String task(Scanner in){
        boolean b;
        System.out.println("Enter your value ");
        b = in.nextBoolean();
        String Yes ="Yes";
        String No ="No";
        if(b == true){
            System.out.println("Your value is " + Yes);
            return Yes;
        }else
            System.out.println("Your value is " + No);
            return No;
    }
}

