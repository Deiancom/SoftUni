package JavaFundamentals.ObjectsAndClasses.Exercise.order_by_age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderByAge> info = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            OrderByAge orderByAge = new OrderByAge(name, id, age);
            orderByAge.setName(name);
            orderByAge.setId(id);
            orderByAge.setAge(age);
            info.add(orderByAge);
            input = scanner.nextLine();
        }
        info.stream().sorted(Comparator.comparingInt(OrderByAge::getAge))
        .forEach(System.out::println);
    }
}
