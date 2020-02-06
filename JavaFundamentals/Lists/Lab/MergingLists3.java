package JavaFundamentals.Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));
        }
        List<Integer> remainingNumbers = new ArrayList<>();
        if (firstList.size() > secondList.size()) {
            for (int i = secondList.size(); i < firstList.size() ; i++) {
                remainingNumbers.add(firstList.get(i));
            }
        } else if (firstList.size() < secondList.size()) {
            for (int i = firstList.size(); i < secondList.size() ; i++) {
                remainingNumbers.add(secondList.get(i));
            }

        }
        resultList.addAll(remainingNumbers);
        for (Integer integer : resultList) {
            System.out.print(integer + " ");
        }
    }
}
