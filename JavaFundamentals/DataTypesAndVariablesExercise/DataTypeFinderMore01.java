package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class DataTypeFinderMore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean haveInt = true;
            try {
                int caseInt = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                haveInt = false;
            }
            boolean haveDouble = true;
            try {
                double caseDouble = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                haveDouble = false;
            }
            if (haveInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (haveDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }

    }
}
