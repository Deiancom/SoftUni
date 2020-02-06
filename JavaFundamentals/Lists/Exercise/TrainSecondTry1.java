package JavaFundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class TrainSecondTry1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsWithPeople = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                int addWagon = Integer.parseInt(tokens[1]);
                wagonsWithPeople.add(addWagon);
            } else {
                int addPeople = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagonsWithPeople.size() ; i++) {
                    if (wagonsWithPeople.get(i) + addPeople <= wagonCapacity) {
                        wagonsWithPeople.set(i, wagonsWithPeople.get(i) + addPeople);
                        break;
                    }
                }
            }

        }
        for (Integer wagonsWithPerson : wagonsWithPeople) {
            System.out.print(wagonsWithPerson + " ");
        }
    }
}