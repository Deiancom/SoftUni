package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class MobileOperator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String years = scanner.nextLine();
        String mobilePlan = scanner.nextLine();
        String internet = scanner.nextLine();
        int mountsForPay = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (years.equals("one")) {
            switch (mobilePlan) {
                case "Small":
                    if (internet.equals("yes")) {
                        price = 9.98 + 5.50;
                    } else {
                        price = 9.98;
                    }
                    break;
                case "Middle":
                    if (internet.equals("yes")) {
                        price = 18.99 + 4.35;
                    } else {
                        price = 18.99;
                    }
                    break;
                case "Large":
                    if (internet.equals("yes")) {
                        price = 25.98 + 4.35;
                    } else {
                        price = 25.98;
                    }
                    break;
                case "ExtraLarge":
                    if (internet.equals("yes")) {
                        price = 35.99 + 3.85;
                    } else {
                        price = 35.99;
                    }
                    break;
            }
        }
        if (years.equals("two")) {
            switch (mobilePlan) {
                case "Small":
                    if (internet.equals("yes")) {
                        price = 8.58 + 5.50;
                    } else {
                        price = 8.58;
                    }
                    break;
                case "Middle":
                    if (internet.equals("yes")) {
                        price = 17.09 + 4.35;
                    } else {
                        price = 17.09;
                    }
                    break;
                case "Large":
                    if (internet.equals("yes")) {
                        price = 23.59 + 4.35;
                    } else {
                        price = 23.59;
                    }
                    break;
                case "ExtraLarge":
                    if (internet.equals("yes")) {
                        price = 31.79 + 3.85;
                    } else {
                        price = 31.79;
                    }
                    break;
            }
        }
        price *= mountsForPay;
        if (years.equals("two")) {
            price -= price * 0.0375;
        }
        System.out.printf("%.2f lv.", price);
    }
}
