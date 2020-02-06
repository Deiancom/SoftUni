package JavaAdvance.Stacks_And_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> elements = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            switch (command) {
                case "1":
                    elements.push(text.toString());
                    text.append(tokens[1]);
                    break;
                case "2":
                    elements.push(text.toString());
                    int eraseCount = Integer.parseInt(tokens[1]);
                    int startIndex = text.length() - eraseCount;
                    int endIndex = text.length();
                    text.delete(startIndex, endIndex);
                    break;
                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                        text = new StringBuilder(elements.pop());
                        break;
            }
        }

    }
}
