package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class UniquePINCodes_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number1 ; i++) {
            for (int j = 1; j <= number2 ; j++) {
                for (int k = 0; k <= number3 ; k++) {

                    boolean caseEven = i % 2 == 0 && i != 0 && k % 2 == 0 && k != 0;
                    boolean caseSimple = j == 2 || j == 3 || j == 5 || j == 7;

                    if(caseEven){
                        if(caseSimple){
                            System.out.printf("%s %s %s%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}