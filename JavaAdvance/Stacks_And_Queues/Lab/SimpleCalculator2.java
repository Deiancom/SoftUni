package JavaAdvance.Stacks_And_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> symbols = new ArrayDeque<>();
        Collections.addAll(symbols, input);
        while (symbols.size() > 1) {
            int firstNumber = Integer.parseInt(symbols.pop());
            String operator = symbols.pop();
            int secondNumber = Integer.parseInt(symbols.pop());
            addOrSubtract(symbols, firstNumber, operator, secondNumber);
        }
        System.out.println(symbols.pop());

    }

    private static void addOrSubtract(ArrayDeque<String> symbols, int firstNumber, String operator, int secondNumber) {
        int result;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                symbols.push(String.valueOf(result));
                break;
            case "-":
                result = firstNumber - secondNumber;
                symbols.push(String.valueOf(result));
                break;
        }
    }
}
