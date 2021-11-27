package Tasks.Conditions.BasicMathematicalOperations;

import Tasks.Classes.FractionClass.FractionClass;

public class CalculatorImpl implements Calculator {

    @Override
    public double calculator(final FractionClass a, final char symbol, final FractionClass b) {
        return switch (symbol) {
            case '+' -> a.add(b).toDouble();
            case '-' -> a.differ(b).toDouble();
            case '*' -> a.multi(b).toDouble();
            case '/' -> a.divide(b).toDouble();
            default -> throw new UnsupportedOperationException("Wrong symbol! Enter one of operations(+, -, *, /):");
        };
    }
}
