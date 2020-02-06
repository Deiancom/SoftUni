package JavaFundamentals.ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int position = rnd.nextInt(words.length);
            String old = words[i];
            String newPosition = words[position];
            words[position] = old;
            words[i] = newPosition;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
