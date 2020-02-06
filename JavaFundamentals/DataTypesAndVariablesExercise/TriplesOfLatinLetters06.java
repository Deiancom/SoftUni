package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            char firsChar = (char) ('a' + i);
            for (int j = 0; j < num; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < num; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firsChar, secondChar, thirdChar);
                }

            }

        }
    }
}
