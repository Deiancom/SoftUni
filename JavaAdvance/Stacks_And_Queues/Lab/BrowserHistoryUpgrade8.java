package JavaAdvance.Stacks_And_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        String line = scanner.nextLine();
        String current = "";
        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!browser.isEmpty()) {
                    current = browser.pop();
                } else if (!current.equals("")) {
                    browser.push(current);
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            }
            if (line.equals("forward")) {
                if (!browser.isEmpty()) {
                    current = browser.poll();
                } else if (!current.equals("")) {
                    browser.addFirst(current);
                } else {
                    System.out.println("no next URLs");
                    line = scanner.nextLine();
                    continue;
                }

                current = line;
            }
            current = line;
            System.out.println(current);
            line = scanner.nextLine();
        }
    }
}
