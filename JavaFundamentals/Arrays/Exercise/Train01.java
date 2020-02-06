package JavaFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfWagons = Integer.parseInt(scanner.nextLine());
        int sumOfPeople = 0;
        for (int i = 0; i < numbersOfWagons ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sumOfPeople += people;
            System.out.print(people + " ");
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
