package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String powerfulWord = "";
        double wordResult = 0;
        while (!word.equals("End of words")) {
            double result = 0;
            for (int i = 0; i < word.length() ; i++) {
                result += word.charAt(i);
            }
            String firstLetter = word.toLowerCase();
            if (firstLetter.charAt(0) == 'a' || firstLetter.charAt(0) == 'e' || firstLetter.charAt(0) == 'i'
             || firstLetter.charAt(0) == 'o' || firstLetter.charAt(0) == 'u' || firstLetter.charAt(0) == 'y') {
                result *= word.length();
            } else {
                result = Math.floor(result / word.length());
            }
            if (result > wordResult) {
                wordResult = result;
                powerfulWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",powerfulWord,wordResult);

    }
}
