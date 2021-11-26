package Conditions.BasicMathematicalOperations;

public class BasicMathematicalOperationsImpl implements BasicMathematicalOperations {

    @Override
    public Integer calculator(String operator, int value1, int value2){
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
}
