package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firsNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());
        long thirdNumber = Long.parseLong(scanner.nextLine());
        long fourthNumber = Long.parseLong(scanner.nextLine());
        long amount = firsNumber + secondNumber;
        amount /= thirdNumber;
        amount *= fourthNumber;
        System.out.println(amount);
    }
}
