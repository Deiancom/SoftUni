package JavaFundamentals.Arrays.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < numbersCount; i++) {
            int addNum = Integer.parseInt(scanner.nextLine());
            listNumbers.add(addNum);
        }
        Collections.reverse(listNumbers);
        for (Integer listNumber : listNumbers) {
            System.out.print(listNumber + " ");
        }
    }
}
