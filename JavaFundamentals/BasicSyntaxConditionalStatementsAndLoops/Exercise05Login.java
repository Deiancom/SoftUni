package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputUserName = scanner.nextLine();
        String reverseUserName = new StringBuffer(inputUserName).reverse().toString();
        String inputPassword = scanner.nextLine();
        int count = 0;

        while (!inputPassword.equals(reverseUserName)) {

            if (!inputPassword.equals(reverseUserName)) {
                count++;
                if (count > 3) {
                    System.out.printf("User %s blocked!", inputUserName);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            }
            inputPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", inputUserName);
    }
}