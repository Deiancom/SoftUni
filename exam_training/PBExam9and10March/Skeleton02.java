package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class Skeleton02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesControlTime = scanner.nextInt() * 60;
        int secondsControlTime = scanner.nextInt() + minutesControlTime;
        double length = scanner.nextDouble();
        int timePer100Meters = scanner.nextInt();
        double slowdown = length / 120;
        slowdown *= 2.5;
        double time = (length / 100) * timePer100Meters - slowdown;
        if (time <= secondsControlTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.%n", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(secondsControlTime - time));
        }
    }
}
