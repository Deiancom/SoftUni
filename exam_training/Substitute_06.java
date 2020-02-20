package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Substitute_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int possibleChangesCounter = 0;

        for (int q = k; q <= 8; q++) {
            for (int j = 9; j >= l; j--) {
                for (int p = m; p <= 8; p++) {
                    for (int z = 9; z >= n; z--) {
                        if (q % 2 == 0 && j % 2 == 1 && p % 2 == 0 && z % 2 == 1) {
                            if (possibleChangesCounter == 6) {
                                break;
                            }
                            if (q == p && j == z) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                possibleChangesCounter++;
                                System.out.printf("%s%s - %s%s%n", q, j, p, z);
                            }

                        }
                    }
                }

            }
        }
    }
}
