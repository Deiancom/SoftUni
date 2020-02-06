package JavaAdvance.Stacks_And_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToPush = scanner.nextInt();
        int numToPop = scanner.nextInt();
        int lookNumber = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < numToPush; i++) {
            numbers.push(scanner.nextInt());
        }
        for (int i = 0; i < numToPop; i++) {
            numbers.pop();
        }
        if (numbers.contains(lookNumber)) {
            System.out.println("true");
        } else {
            if (!numbers.isEmpty()) {
                System.out.println(Collections.min(numbers));
            } else {
                System.out.println(0);
            }

        }

    }
}
