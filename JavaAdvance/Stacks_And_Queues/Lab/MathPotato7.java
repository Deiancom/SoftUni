package JavaAdvance.Stacks_And_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < count; i++)
                queue.offer(queue.poll());
            if (checkForPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    static boolean checkForPrime(int cycle) {
        boolean isItPrime = true;

        if (cycle <= 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= cycle / 2; i++) {
                if ((cycle % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
        }
        return isItPrime;
    }
}
