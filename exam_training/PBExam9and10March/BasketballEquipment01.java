package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class BasketballEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = scanner.nextInt();

        double snickers = tax * 0.60;
        double shortsAndShirt = snickers * 0.80;
        double ball = shortsAndShirt * 0.25;
        double accessories = ball * 0.20;

        double sum = tax + snickers + shortsAndShirt + ball + accessories;
        System.out.printf("%.2f", sum);
    }
}
