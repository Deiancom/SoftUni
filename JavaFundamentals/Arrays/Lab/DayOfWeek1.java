package JavaFundamentals.Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        String[] week = new String[] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        if (day >= 1 && day <= 7) {
            System.out.println(week[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
