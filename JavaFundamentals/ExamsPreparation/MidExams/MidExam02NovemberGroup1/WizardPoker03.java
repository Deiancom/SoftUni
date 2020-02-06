package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup1;

import java.util.*;
import java.util.stream.Collectors;

public class WizardPoker03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> availableCard = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> magicCards = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Ready")) {
                break;
            }
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add": {
                    String cardName = command[1];
                    if (availableCard.contains(cardName)) {
                        magicCards.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Remove": {
                    String cardName = command[1];
                    if (magicCards.contains(cardName)) {
                        magicCards.remove(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Insert": {
                    String cardName = command[1];
                    int index = Integer.parseInt(command[2]);
                    if (availableCard.contains(cardName) && index >= 0 && index < magicCards.size()) {
                        magicCards.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                }
                case "Swap":
                    String firstCard = command[1];
                    String secondCard = command[2];
                    int firstIndex = magicCards.indexOf(firstCard);
                    int secondIndex = magicCards.indexOf(secondCard);
                    magicCards.set(firstIndex, secondCard);
                    magicCards.set(secondIndex, firstCard);
                    break;
                case "Shuffle":
                    Collections.reverse(magicCards);
                    break;
            }
        }
        for (String magicCard : magicCards) {
            System.out.print(magicCard + " ");
        }
    }
}
