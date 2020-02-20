package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sector = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());
        rows = rows - 1;
        int count = 0;
        int p = sector.charAt(0);

        for (int i = 65; i <= p; i++) {
            rows++;
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 0) {
                    int m = seats + 97 + 2;
                    for (int k = 97; k < m; k++) {
                        System.out.printf("%c%d%c%n", i, j, k);
                        count++;
                    }
                } else {
                    int m = seats + 97;
                    for (int k = 97; k < m; k++) {
                        System.out.printf("%c%d%c%n", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}