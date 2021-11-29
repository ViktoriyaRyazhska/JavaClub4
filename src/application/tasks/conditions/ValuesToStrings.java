package application.tasks.conditions;

import java.util.Scanner;

public class ValuesToStrings {
    public static String task(boolean b){
        String Yes ="Yes";
        String No ="No";
        Scanner bool = new Scanner(System.in);
        System.out.println("Your value is " + b);
        b = bool.nextBoolean();
        if(b == true){
            return Yes;
        }else
            return No;
    }
}

