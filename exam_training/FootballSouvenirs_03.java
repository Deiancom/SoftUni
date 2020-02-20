package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int numberOfSouvenirs = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean itsTrueCountry = false;
        boolean itsTrueSouvenir = false;
        switch (country) {
            case ("Argentina"):
                itsTrueCountry = true;
                switch (souvenir) {
                    case "flags":
                        price = numberOfSouvenirs * 3.25;
                        itsTrueSouvenir = true;
                        break;
                    case "caps":
                        price = numberOfSouvenirs * 7.20;
                        itsTrueSouvenir = true;
                        break;
                    case "posters":
                        price = numberOfSouvenirs * 5.10;
                        itsTrueSouvenir = true;
                        break;
                    case "stickers":
                        price = numberOfSouvenirs * 1.25;
                        itsTrueSouvenir = true;
                        break;
                }
                break;
            case ("Brazil"):
                itsTrueCountry = true;
                switch (souvenir) {
                    case "flags":
                        price = numberOfSouvenirs * 4.20;
                        itsTrueSouvenir = true;
                        break;
                    case "caps":
                        price = numberOfSouvenirs * 8.50;
                        itsTrueSouvenir = true;
                        break;
                    case "posters":
                        price = numberOfSouvenirs * 5.35;
                        itsTrueSouvenir = true;
                        break;
                    case "stickers":
                        price = numberOfSouvenirs * 1.20;
                        itsTrueSouvenir = true;
                        break;
                }
                break;
            case ("Croatia"):
                itsTrueCountry = true;
                switch (souvenir) {
                    case "flags":
                        price = numberOfSouvenirs * 2.75;
                        itsTrueSouvenir = true;
                        break;
                    case "caps":
                        price = numberOfSouvenirs * 6.90;
                        itsTrueSouvenir = true;
                        break;
                    case "posters":
                        price = numberOfSouvenirs * 4.95;
                        itsTrueSouvenir = true;
                        break;
                    case "stickers":
                        price = numberOfSouvenirs * 1.10;
                        itsTrueSouvenir = true;
                        break;
                }
                break;
            case ("Denmark"):
                itsTrueCountry = true;
                switch (souvenir) {
                    case "flags":
                        price = numberOfSouvenirs * 3.10;
                        itsTrueSouvenir = true;
                        break;
                    case "caps":
                        price = numberOfSouvenirs * 6.50;
                        itsTrueSouvenir = true;
                        break;
                    case "posters":
                        price = numberOfSouvenirs * 4.80;
                        itsTrueSouvenir = true;
                        break;
                    case "stickers":
                        price = numberOfSouvenirs * 0.90;
                        itsTrueSouvenir = true;
                        break;
                }
                break;
        }
        if (!itsTrueCountry) {
            System.out.println("Invalid country!");
        } else if (!itsTrueSouvenir) {
            System.out.println("Invalid stock!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfSouvenirs, souvenir, country, price);
        }
    }
}