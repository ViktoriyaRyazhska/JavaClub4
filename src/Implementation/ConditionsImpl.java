package Implementation;
import java.util.Scanner;
import Conditions.*;

public class ConditionsImpl {
    public static int oppositeNumber(){
        System.out.println("opposite-number");
        System.out.println("Введіть число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //OppositeNumber op = new OppositeNumber();
        scanner.close();
        return OppositeNumber.opposite(number);
    }

}
