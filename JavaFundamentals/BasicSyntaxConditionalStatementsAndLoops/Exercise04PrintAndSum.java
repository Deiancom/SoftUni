package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%d ", i);
            sum += i;

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
