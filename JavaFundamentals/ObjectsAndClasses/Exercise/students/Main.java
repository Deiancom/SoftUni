package JavaFundamentals.ObjectsAndClasses.Exercise.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentsInfo = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Students students = new Students(firstName, lastName, grade);
            students.setFirstName(firstName);
            students.setLastName(lastName);
            students.setGrade(grade);
            studentsInfo.add(students);
        }
        studentsInfo.stream().sorted((g1, g2) -> Double.compare(g2.getGrade(), g1.getGrade()))
                .forEach(e -> System.out.println(e));
    }
}
