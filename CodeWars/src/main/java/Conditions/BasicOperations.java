package Conditions;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2){
        int answer = 0;
        switch(op){
            case "+":
                answer=v1+v2;
                break;
            case "-":
                answer=v1-v2;
                break;
            case "*":
                answer=v1*v2;
                break;
            case "/":
                answer=v1/v2;
                break;
        }

        return answer;
    }
}

