package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int maxResult = 0;
        String winName = "";

        while (!playerName.equals("Stop")) {
            int result = 0;
            for (int i = 0; i < playerName.length() ; i++) {
                char letter = playerName.charAt(i);
                int number = Integer.parseInt(scanner.nextLine());
                if (letter == number) {
                    result += 10;
                } else {
                    result += 2;
                }
            }
            if (result >= maxResult) {
                maxResult = result;
                winName = playerName;
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",winName,maxResult);
    }
}
