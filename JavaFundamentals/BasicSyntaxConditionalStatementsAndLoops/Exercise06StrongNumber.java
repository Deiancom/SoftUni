package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        long checkNum = input;
        long sumFactorial = 0;

        while (checkNum != 0) {
            long result = checkNum % 10;
            checkNum /= 10;
            long factorial = 1;
            for (int i = 1; i <= result ; i++) {
                factorial *= i;
            }
            sumFactorial += factorial;
        }
        if (sumFactorial == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
