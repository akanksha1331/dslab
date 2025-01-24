package dslab;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorInput input = new CalculatorInput();

        try {
            while (true) {
                String operation = input.getOperation();
                if (operation.equals("exit")) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }

                double num1 = input.getNumber("Enter the first number: ");
                double num2 = input.getNumber("Enter the second number: ");

                double result;
                switch (operation) {
                    case "add":
                        result = calculator.add(num1, num2);
                        break;
                    case "sub":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "mul":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "div":
                        try {
                            result = calculator.divide(num1, num2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Please try again.");
                        continue;
                }
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            input.close();
        }
    }
}
