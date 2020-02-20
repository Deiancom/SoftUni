package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vip = scanner.nextLine();
        int daysNumber = Integer.parseInt(scanner.nextLine());
        double priceForDay = 0;
        boolean isValidTown = false;
        boolean isValidPackage = false;
        if (daysNumber > 7) {
            daysNumber --;
        }
        if (town.equals("Bansko")|| town.equals("Borovets")) {
            isValidTown = true;
            if (packageType.equals("noEquipment")) {
                priceForDay = 80.00;
                isValidPackage = true;
                if (vip.equals("yes")) {
                    priceForDay = priceForDay - priceForDay * 0.05;
                }
            }else if (packageType.equals("withEquipment")) {
                priceForDay = 100.00;
                isValidPackage = true;
                if (vip.equals("yes")) {
                    priceForDay = priceForDay - priceForDay * 0.10;
                }
            }
        }else if (town.equals("Varna")|| town.equals("Burgas")) {
            isValidTown = true;
            if (packageType.equals("noBreakfast")) {
                priceForDay = 100.00;
                isValidPackage =true;
                if (vip.equals("yes")) {
                    priceForDay = priceForDay - priceForDay * 0.07;
                }
            }else if (packageType.equals("withBreakfast")) {
                priceForDay = 130.00;
                isValidPackage = true;
                if (vip.equals("yes")) {
                    priceForDay = priceForDay - priceForDay * 0.12;
                }
            }
        }

        double finalPrice = priceForDay * daysNumber;
        if (!isValidTown || !isValidPackage) {
            System.out.println("Invalid input!");
        } else if (daysNumber < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }

    }
}