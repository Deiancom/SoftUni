package JavaAdvance.Stacks_And_Queues.Exercises;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }


    static String infixToPostfix(String exp) {

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result.append(c).append(" ");

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop()).append(" ");

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    result.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.pop()).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();
        exp = exp.replaceAll(" ", "");
        System.out.println(infixToPostfix(exp));
    }
}

