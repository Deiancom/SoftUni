package JavaFundamentals.ExamsPreparation.MidExams.MidExam30JuneGroup1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberArray02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            if (command[0].equals("Switch")) {
                int index = Integer.parseInt(command[1]);
                if (isIndexValid(numberList, index)) {
                    int backup = numberList.get(index);
                    numberList.set(index, backup * -1);
                }
            } else if (command[0].equals("Change")) {
                int index = Integer.parseInt(command[1]);
                int value = Integer.parseInt(command[2]);
                if (isIndexValid(numberList, index)) {
                    numberList.set(index, value);
                }
            } else if (command[1].equals("Negative")) {
                int sum = 0;
                for (Integer integer : numberList) {
                    if (integer < 0) {
                        sum += integer;
                    }
                }
                System.out.println(sum);
            } else if (command[1].equals("Positive")) {
                int sum = 0;
                for (Integer integer : numberList) {
                    if (integer >= 0) {
                        sum += integer;
                    }
                }
                System.out.println(sum);
            } else if (command[1].equals("All")) {
                int sum = 0;
                for (Integer integer : numberList) {
                    sum += integer;
                }
                System.out.println(sum);
            }
            input = scanner.nextLine();
        }
        for (Integer integer : numberList) {
            if (integer >= 0) {
                System.out.print(integer + " ");
            }
        }
    }
    private static boolean isIndexValid(List<Integer> numbers, int index) {
        return index >= 0 && index < numbers.size();
    }
}
