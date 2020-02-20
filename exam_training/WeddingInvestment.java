package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractTime = scanner.nextLine();
        String contractType = scanner.nextLine();
        String desert = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (contractTime.equals("one")) {
            if (contractType.equals("Small")) {
                price = 9.98;
                if (desert.equals("yes")) {
                    price += 5.50;
                }
            }else if (contractType.equals("Middle")) {
                price = 18.99;
                if (desert.equals("yes")) {
                    price += 4.35;
                }
            }else if (contractType.equals("Large")) {
                price = 25.98;
                if (desert.equals("yes")) {
                    price += 4.35;
                }
            }else {
                price = 35.99;
                if (desert.equals("yes")) {
                    price += 3.85;
                }
            }
        }else {
            if (contractType.equals("Small")) {
                price = 8.58;
                if (desert.equals("yes")) {
                    price += 5.50;
                }
            }else if (contractType.equals("Middle")) {
                price = 17.09;
                if (desert.equals("yes")) {
                    price += 4.35;
                }
            }else if (contractType.equals("Large")) {
                price = 23.59;
                if (desert.equals("yes")) {
                    price += 4.35;
                }
            }else {
                price = 31.79;
                if (desert.equals("yes")) {
                    price += 3.85;
                }
            }
        }
        double finalPrice = price * months;
        if (contractTime.equals("two")) {
            finalPrice = finalPrice - finalPrice * 0.0375;
        }
        System.out.printf("%.2f lv.",finalPrice);

    }
}
