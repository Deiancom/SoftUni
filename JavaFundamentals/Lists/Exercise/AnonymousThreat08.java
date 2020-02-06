package JavaFundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("3:1")) {
                break;
            }
            String[] input = command.split("\\s+");
            if (input[0].equals("merge")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > numbers.size() - 1) {
                    endIndex = numbers.size() - 1;
                }
                int counter = startIndex;
                for (int i = startIndex; i < endIndex; i++) {
                    String backupList = "";
                    backupList += (numbers.get(counter) + numbers.get(counter + 1));
                    numbers.set(counter, backupList);
                    numbers.remove(counter + 1);
                }
            } else if (input[0].equals("divide")) {
                int index = Integer.parseInt(input[1]);
                int partition = Integer.parseInt(input[2]);
                List<String> divideList = new ArrayList<>();
                String parts = numbers.get(index);
                new StringBuilder();
                StringBuilder toList;
                int dividedParts = parts.length() / partition;
                int counter = 0;
                if (parts.length() % partition == 0) {
                    for (int i = 0; i < partition; i++) {
                        toList = new StringBuilder();
                        for (int j = 0; j < dividedParts; j++) {
                            toList.append(parts.charAt(counter));
                            counter++;
                        }
                        divideList.add(toList.toString());
                    }
                } else {
                    for (int i = 0; i < partition; i++) {
                        toList = new StringBuilder();
                        if (i == partition - 1) {
                            for (int j = counter; j < parts.length(); j++) {
                                toList.append(parts.charAt(counter));
                                counter++;
                            }
                        } else {
                            for (int j = 0; j < dividedParts; j++) {
                                toList.append(parts.charAt(counter));
                                counter++;
                            }
                        }
                        divideList.add(toList.toString());
                    }
                }
                numbers.remove(index);
                numbers.addAll(index, divideList);
            }
        }
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}