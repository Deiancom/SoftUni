package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Traveling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            while (!input.equals("End")) {
                double budget = Double.parseDouble(scanner.nextLine());
                double savings = 0;

                while (savings < budget) {
                    savings += Double.parseDouble(scanner.nextLine());
                }

                System.out.println("Going to " + input + "!");
                input = scanner.nextLine();
            }
        }
    }

