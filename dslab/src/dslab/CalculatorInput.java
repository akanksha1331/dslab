package dslab;

import java.util.Scanner;

public class CalculatorInput {
    private final Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        System.out.print("Enter operation (add, sub, mul, div): ");
        return scanner.nextLine().toLowerCase();
    }

    public double getNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}
