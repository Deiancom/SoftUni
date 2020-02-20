package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Repainting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine()) + 2;
        double paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonPrice = nylon * 1.50;
        paint = paint + paint * 0.10;
        double paintPrice = (paint * 14.50);
        double diluentPrice = diluent * 5.00;
        double productPrice = nylonPrice + paintPrice + diluentPrice + 0.40;
        double workerPrice = productPrice * 0.30;
        double finalWorkerPrice = workerPrice * hours;
        double allExpenses = finalWorkerPrice + productPrice;
        System.out.printf("Total expenses: %.2f lv.",allExpenses);

    }
}
