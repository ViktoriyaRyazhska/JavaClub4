package tasks.conditions;

public class BasicOperations{
    private static Integer basicMath(String op, int v1, int v2){
        int rezult = 0;
        switch (op) {
            case ("+"):
                rezult = v1 + v2;
                break;
            case ("-"):
                rezult = v1 - v2;
                break;
            case ("*"):
                rezult = v1 * v1;
                break;
            case ("/"):
                rezult = v1 / v2;
        }
        return  rezult;
    }

    public void execute(String op, int v1, int v2){
        System.out.println(basicMath(op, v1,  v2));
    }
}