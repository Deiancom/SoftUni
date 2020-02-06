package JavaFundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCardList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondCardList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            if (firstCardList.size() == 0) {
                break;
            } else if (secondCardList.size() == 0) {
                break;
            }
            if (firstCardList.get(0).equals(secondCardList.get(0))) {
                firstCardList.remove(0);
                secondCardList.remove(0);
            } else if (firstCardList.get(0) > secondCardList.get(0)) {
                int backupFirstCard = firstCardList.get(0);
                firstCardList.remove(0);
                firstCardList.add(backupFirstCard);
                firstCardList.add(secondCardList.get(0));
                secondCardList.remove(0);
            } else {
                int backupFirstCard = secondCardList.get(0);
                secondCardList.remove(0);
                secondCardList.add(backupFirstCard);
                secondCardList.add(firstCardList.get(0));
                firstCardList.remove(0);
            }
        }
        int sum = 0;
        if (firstCardList.size() == 0) {
            for (Integer integer : secondCardList) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (Integer integer : firstCardList) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
