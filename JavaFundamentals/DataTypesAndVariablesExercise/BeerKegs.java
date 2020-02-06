package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String kegType = "";
        double volumeEqual = 0;
        for (int i = 0; i < num; i++) {
            String keg = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > volumeEqual) {
                kegType = keg;
                volumeEqual = volume;
            }
        }
        System.out.println(kegType);
    }
}
