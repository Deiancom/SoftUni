package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class FitnessCenter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinBar = 0;
        int proteinShake = 0;
        for (int i = 0; i <= peopleNumber; i++) {
            String input = scanner.nextLine();
            switch (input) {
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        double percentTraining = back + chest + legs + abs;
        percentTraining = (percentTraining / peopleNumber) * 100;
        double percentBuyProtein = proteinBar + proteinShake;
        percentBuyProtein = (percentBuyProtein / peopleNumber) * 100;
        System.out.println(back + " - back");
        System.out.println(chest + " - chest");
        System.out.println(legs + " - legs");
        System.out.println(abs + " - abs");
        System.out.println(proteinShake + " - protein shake");
        System.out.println(proteinBar + " - protein bar");
        System.out.printf("%.2f%% - work out%n", percentTraining);
        System.out.printf("%.2f%% - protein", percentBuyProtein);
    }
}
