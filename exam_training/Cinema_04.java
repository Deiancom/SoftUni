package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cinemaSeats = Integer.parseInt(scanner.nextLine());
        int incomeSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int peopleNum = Integer.parseInt(input);
            if (cinemaSeats - peopleNum >= 0) {
                cinemaSeats -= peopleNum;
                incomeSum += peopleNum * 5;
                if (peopleNum % 3 == 0) {
                    incomeSum -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", incomeSum);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.%n", cinemaSeats);
        System.out.printf("Cinema income - %d lv.", incomeSum);


    }
}
