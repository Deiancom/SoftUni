package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Bus_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passengers = Integer.parseInt(scanner.nextLine());
        int countStops = Integer.parseInt(scanner.nextLine());
        int getOff;
        int getIn;
        for (int i = 1; i <= countStops; i++) {
            getOff = Integer.parseInt(scanner.nextLine());
            getIn = Integer.parseInt(scanner.nextLine());
            passengers -= getOff;
            passengers += getIn;
            if (i % 2 == 1) {
                passengers += 2;
            } else if (i % 2 == 0) {
                passengers -= 2;
            }
        }
        System.out.printf("The final number of passengers is : %d", passengers);
    }
}