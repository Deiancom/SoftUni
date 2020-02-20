package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FavoriteMovie06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = -1;
        String movieName = "";
        int counter = 0;
        while (!input.equals("STOP")) {
            int currentSum = 0;
            counter++;
            for (int i = 0; i < input.length(); i++) {
                int currentSymbol = input.charAt(i);
                currentSum += currentSymbol;
                if (currentSymbol >= 'a' && currentSymbol <= 'z') {
                    currentSum -= 2 * input.length();
                } else if (currentSymbol >= 'A' && currentSymbol <= 'Z') {
                    currentSum -= input.length();
                }
            }
            if (currentSum > sum) {
                sum = currentSum;
                movieName = input;
            }
            if (counter >= 7) {
                System.out.println("The limit is reached.");
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", movieName, sum);
    }
}
