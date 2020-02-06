package JavaAdvance.Stacks_And_Queues.Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        fibArray[0] = 1;
        fibArray[1] = 1;
        System.out.println(fibonacci(n));
    }

    public static long[] fibArray = new long[100];

    public static long fibonacci(long n) {
        long fibValue;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }
}
