package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Arrays;
import java.util.Scanner;

public class FootballResults02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstMach = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondMach = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] thirdMach = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int win = 0;
        int draw = 0;
        int lose = 0;
        if (firstMach[0] > firstMach[1]) {
            win++;
        } else if (firstMach[0] == firstMach[1]) {
            draw++;
        } else {
            lose++;
        }
        if (secondMach[0] > secondMach[1]) {
            win++;
        } else if (secondMach[0] == secondMach[1]) {
            draw++;
        } else {
            lose++;
        }
        if (thirdMach[0] > thirdMach[1]) {
            win++;
        } else if (thirdMach[0] == thirdMach[1]) {
            draw++;
        } else {
            lose++;
        }
        System.out.println("Team won " + win + " games.");
        System.out.println("Team lost " + lose + " games.");
        System.out.print("Drawn games: " + draw);
    }
}
