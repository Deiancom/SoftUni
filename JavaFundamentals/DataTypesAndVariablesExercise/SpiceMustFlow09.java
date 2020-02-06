package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spiceNumber = Integer.parseInt(scanner.nextLine());
        int spiceCount = 0;
        int days = 0;
        while (spiceNumber > 0) {
            if (spiceNumber < 100) {
                if (spiceCount < 26) {
                    break;
                }
                spiceCount -= 26;
                break;
            }
            spiceCount += spiceNumber - 26;
            days++;
            spiceNumber -= 10;
        }
        System.out.println(days);
        System.out.println(spiceCount);
    }
}
