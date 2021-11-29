package application.tasks.conditions;

import java.util.Scanner;

public class ValuesToStrings {
    public static String task(boolean b,Scanner in){
        String Yes ="Yes";
        String No ="No";
        System.out.println("Your value is " + b);
        b = in.nextBoolean();
        if(b == true){
            return Yes;
        }else
            return No;
    }
}

