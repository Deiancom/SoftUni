package JavaAdvance.Stacks_And_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();

        String oneOfThese = "{[(";
        boolean print = true;

        String brackets = scanner.nextLine();
        for (int i = 0; i < brackets.length(); i++) {
            char current = brackets.charAt(i);

            if (oneOfThese.contains(current + "")) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    print = false;
                    break;
                } else {
                    char stackBracket = stack.pop();
                    if (stackBracket == '{' && current != '}' ||
                            stackBracket == '[' && current != ']' ||
                            stackBracket == '(' && current != ')') {
                        print = false;
                        break;
                    }
                }
            }
        }

        if (print) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}

