package Comment.refactoringCode.ExtractMethod;

public class Calculator {
    public int add(int number1, int number2) {
        return performOperation(number1, number2, "add");
    }

    public int subtract(int number1, int number2) {
        return performOperation(number1, number2, "subtract");
    }

    public int multiply(int number1, int number2) {
        return performOperation(number1, number2, "multiply");
    }


    private int performOperation(int number1, int number2, String operation) {
        switch (operation) {
            case "add":
                return number1 + number2;
            case "subtract":
                return number1 - number2;
            case "multiply":
                return number1 * number2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
