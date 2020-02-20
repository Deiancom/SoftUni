package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldGames = Integer.parseInt(scanner.nextLine());

        double hearthstone = 0;
        double fornite = 0;
        double overwatch = 0;
        double others = 0;
        double percent = soldGames / 100.0;

        for (int i = 0; i < soldGames ; i++) {
            String gameName = scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        hearthstone = hearthstone / percent;
        fornite = fornite / percent;
        overwatch = overwatch / percent;
        others = others / percent;
        System.out.printf("Hearthstone - %.2f%%%n",hearthstone);
        System.out.printf("Fornite - %.2f%%%n",fornite);
        System.out.printf("Overwatch - %.2f%%%n",overwatch);
        System.out.printf("Others - %.2f%%",others);
    }
}
