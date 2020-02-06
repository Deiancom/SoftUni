package JavaFundamentals.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsInfo = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");
            String firstName = commands[0];
            String secondName = commands[1];
            String age = commands[2];
            String town = commands[3];
            Students students = new Students();
            students.setFirstName(firstName);
            students.setSecondName(secondName);
            students.setAge(age);
            students.setHomeTown(town);
            studentsInfo.add(students);
            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        List<Students> filterStudent = studentsInfo.stream().filter(e -> e.getHomeTown().equals(cityName))
                .collect(Collectors.toList());
        for (Students students : filterStudent) {
            System.out.printf("%s %s is %s years old%n", students.getFirstName(), students.getSecondName(),
                    students.getAge());
        }

    }

    public static class Students {
        private String firstName;
        private String secondName;
        private String age;
        private String homeTown;

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    }
}
