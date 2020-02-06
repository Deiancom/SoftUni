package JavaFundamentals.Arrays.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        List<String> dayOfWeek = new ArrayList<>();
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");
        if (day > 0 && day < 8) {
            System.out.println(dayOfWeek.get(day - 1));
        } else {
            System.out.println("Invalid day!");
        }
    }
}
