package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfTheASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());
        int stopSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = startSymbol; i <= stopSymbol  ; i++) {
            System.out.printf("%c ",i);

        }
    }
}
