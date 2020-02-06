package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int waterTank = 255;
        int fullOfWater = 0;
        for (int i = 0; i < num; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            if (water <= waterTank) {
                waterTank -= water;
                fullOfWater += water;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(fullOfWater);
    }
}