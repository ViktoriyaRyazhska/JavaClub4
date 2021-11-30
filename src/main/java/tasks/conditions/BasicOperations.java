package tasks.conditions;

public class BasicOperations{
    public static Integer basicMath(String op, int v1, int v2){
        int result = 0;
        switch (op) {
            case ("+"):
                result = v1 + v2;
                break;
            case ("-"):
                result = v1 - v2;
                break;
            case ("*"):
                result = v1 * v2;
                break;
            case ("/"):
                result = v1 / v2;
        }
        return  result;
    }

    public void execute(String op, int v1, int v2){
        System.out.println(basicMath(op, v1,  v2));
    }
}