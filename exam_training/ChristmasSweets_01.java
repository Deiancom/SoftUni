package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ChristmasSweets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baklavaPrice = Double.parseDouble(scanner.nextLine());
        double muffinsPrice = Double.parseDouble(scanner.nextLine());
        double shtolenKg = Double.parseDouble(scanner.nextLine());
        double bonbonsKg = Double.parseDouble(scanner.nextLine());
        double biscuitsKg = Double.parseDouble(scanner.nextLine()) * 7.50;

        double shtolenPrice = baklavaPrice + baklavaPrice * 0.60;
        shtolenPrice = shtolenPrice * shtolenKg;
        double bonbonsPrice = muffinsPrice + muffinsPrice * 0.80;
        bonbonsPrice = bonbonsPrice * bonbonsKg;
        double sum = shtolenPrice + bonbonsPrice + biscuitsKg;
        System.out.printf("%.2f", sum);
    }
}
