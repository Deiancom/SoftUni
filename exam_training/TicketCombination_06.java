package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class TicketCombination_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 66; i <= 76; i+=2) {
            for (int j = 102; j >= 97; j--) {
                for (int k = 65; k <= 67; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 10; m >= 1 ; m--) {
                            count++;
                            if (count == number) {
                                System.out.printf("Ticket combination: %c%c%c%d%d%n", (char)i, (char)j, (char)k, l, m);
                                System.out.printf("Prize: %d lv.", (i+j+k+l+m));
                            }
                        }
                    }
                }
            }
        }
    }
}
