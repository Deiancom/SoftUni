package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class OwnBussiness_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = width * length * height;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int computersNumber = Integer.parseInt(input);
            area -= computersNumber;
            if (area <= 0 ) {
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(area));
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.",area);

    }
}
