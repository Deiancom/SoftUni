package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class Substitute06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firsNumFirstInterval = Integer.parseInt(scanner.nextLine());
        int firsNumSecondInterval = Integer.parseInt(scanner.nextLine());
        int secondNumFirstInterval = Integer.parseInt(scanner.nextLine());
        int secondNumSecondInterval = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int j = firsNumFirstInterval; j < 9; j++) {
            for (int k = 9; k >= firsNumSecondInterval; k--) {
                for (int l = secondNumFirstInterval; l < 9; l++) {
                    for (int m = 9; m >= secondNumSecondInterval; m--) {
                        if (j % 2 == 0 && k % 2 != 0 && l % 2 == 0 & m % 2 != 0) {
                            if (j == l && k == m) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                counter++;
                                System.out.printf("%d%d - %d%d%n", j, k, l, m);
                            }
                            if (counter == 6) return;
                        }
                    }

                }
            }
        }
    }
}
