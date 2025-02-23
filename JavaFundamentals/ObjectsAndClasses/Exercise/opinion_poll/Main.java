package JavaFundamentals.ObjectsAndClasses.Exercise.opinion_poll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> people = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            if (age > 30) {
                OpinionPoll opinionPoll = new OpinionPoll(name, age);
                opinionPoll.setName(name);
                opinionPoll.setAge(age);
                people.add(opinionPoll);
            }

        }
        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
        .forEach(e -> System.out.println(e) );
    }
}
