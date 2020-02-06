package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elevatorCapacity = scanner.nextInt();
        int peopleNumber = scanner.nextInt();

        int elevatorCourses = (int)Math.ceil((double) elevatorCapacity / peopleNumber);
        System.out.println(elevatorCourses);
    }
}
