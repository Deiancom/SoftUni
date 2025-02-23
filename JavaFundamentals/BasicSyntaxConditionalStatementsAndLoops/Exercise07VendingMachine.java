package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String textInput;
        while (true) {
            textInput = scanner.nextLine();
            if (textInput.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(textInput);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.println("Cannot accept " + coin);
            }
        }
        double price = 0;
        String input;
        boolean flag = false;
        while (true) {
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "nuts":
                    price = 2;
                    flag = true;
                    break;
                case "water":
                    price = 0.7;
                    flag = true;
                    break;
                case "crisps":
                    price = 1.5;
                    flag = true;
                    break;
                case "soda":
                    price = 0.8;
                    flag = true;
                    break;
                case "coke":
                    price = 1;
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid product");
            }
            if (input.equals("End")) {
                break;
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else if (flag) {
                System.out.println("Purchased " + input);
                sum -= price;
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
