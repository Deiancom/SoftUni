package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class NameWars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxSum = 0;
        String greatestName = null;
        while (!name.equals("STOP")) {

            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                sum += symbol;

            }

            if (sum > maxSum) {
                maxSum = sum;
                greatestName = name;
            }


            name = scanner.nextLine();
        }

        System.out.printf("Winner is %s - %d!", greatestName, maxSum);
    }
}

