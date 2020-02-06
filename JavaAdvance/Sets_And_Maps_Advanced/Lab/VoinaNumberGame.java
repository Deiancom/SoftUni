package JavaAdvance.Sets_And_Maps_Advanced.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();
        int[] cardsForFirstPlayer = readIntArray(rd);
        int[] cardsForSecondPlayer = readIntArray(rd);
        for (int i = 0; i < cardsForFirstPlayer.length; i++) {
            firstPlayer.add(cardsForFirstPlayer[i]);
            secondPlayer.add(cardsForSecondPlayer[i]);
        }


        for (int i = 0; i < 50; i++) {

            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }
            int firstCard = firstPlayer.iterator().next();
            firstPlayer.remove(firstCard);
            int secondCard = secondPlayer.iterator().next();
            secondPlayer.remove(secondCard);
            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else if (secondCard > firstCard) {
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (firstPlayer.size() < secondPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int[] readIntArray(BufferedReader rd) throws IOException {
        return Arrays.stream(rd.readLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();
    }
}
