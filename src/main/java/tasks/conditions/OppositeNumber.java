package tasks.conditions;

public class OppositeNumber {

    public static int opposite(int number)
    {
        return number / -1;
    }

    public void execute(int n){
        System.out.println(opposite(n));
    }
}
