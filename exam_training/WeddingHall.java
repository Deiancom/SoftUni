package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthOfHall = Double.parseDouble(scanner.nextLine());
        double weightOfHall = Double.parseDouble(scanner.nextLine());
        double barSideMeters = Double.parseDouble(scanner.nextLine());
        double hallArea = lengthOfHall * weightOfHall;
        double barArea = barSideMeters * barSideMeters;
        double danceArea = hallArea * 0.19;
        double freeSpace = hallArea - barArea - danceArea;
        double guestCount = freeSpace / 3.2;
        System.out.printf("%.0f", Math.ceil(guestCount));
    }
}
