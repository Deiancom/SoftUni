package JavaAdvance.Stacks_And_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (queue.isEmpty()) {
                if (input.equals("cancel")) {
                    System.out.println("Printer is on standby");
                } else {
                    queue.offer(input);
                }
            } else {
                if (input.equals("cancel")) {
                    System.out.println("Canceled " + queue.pollFirst());
                } else {
                    queue.offer(input);
                }
            }
            input = scanner.nextLine();
        }
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
