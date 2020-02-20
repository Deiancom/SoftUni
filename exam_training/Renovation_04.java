package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        int wallsArea = (height * width * 4);
        double areaForPainting = Math.ceil(wallsArea - wallsArea * percent / 100);
        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int paintLiters = Integer.parseInt(input);
            areaForPainting -= paintLiters;
            if (areaForPainting <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (areaForPainting < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(areaForPainting));

        } else if (input.equalsIgnoreCase("Tired!")){
            System.out.printf("%.0f quadratic m left.",areaForPainting);
        } else if (areaForPainting == 0){
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
