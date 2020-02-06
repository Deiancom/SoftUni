package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TrainSecondTry01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] people = new int[num];
        int sum = 0;
        for (int i = 0; i < people.length ; i++) {
            int peopleNumber = Integer.parseInt(scanner.nextLine());
            people[i] = peopleNumber;
            sum += peopleNumber;
            System.out.print(peopleNumber + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
