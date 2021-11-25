package Conditions.BasicMathematicalOperations;

public class BasicMathematicalOperations {
    private static Integer calculator(String operator, int value1, int value2){
        int result = 0;
        switch (operator) {
            case ("+"):
                result = value1 + value2;
                break;
            case ("-"):
                result = value1 - value2;
                break;
            case ("*"):
                result = value1 * value2;
                break;
            case ("/"):
                result = value1 / value2;
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(calculator("+",2,3));

    }
}
