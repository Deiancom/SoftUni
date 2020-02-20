package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class CookieFactory_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batches = Integer.parseInt(input.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= batches; i++) {
            String command = input.nextLine();
            while (!command.equalsIgnoreCase("bake!")) {
                if (command.equalsIgnoreCase("flour")) {
                    a++;
                } else if (command.equalsIgnoreCase("eggs")) {
                    b++;
                } else if (command.equalsIgnoreCase("sugar")) {
                    c++;
                }
                command = input.nextLine();
            }
            if (a == 0 || b == 0 || c == 0) {
                System.out.printf("The batter should contain flour, eggs and sugar!%n");
                i--;
            } else {
                System.out.printf("Baking batch number %d...%n", i);
                a = 0;
                b = 0;
                c = 0;
            }
        }
    }
}


