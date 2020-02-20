package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class HighJump06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int startHeight = height - 30;
        int jumpsCount = 0;
        int unsuccessful = 0;
        do {
            int jumpHeight = Integer.parseInt(scanner.nextLine());
            jumpsCount++;
            if (jumpHeight > startHeight) {
                startHeight += 5;
                unsuccessful = 0;
            } else {
                unsuccessful++;
                if (unsuccessful == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", startHeight, jumpsCount);
                    return;
                }
            }
        }
        while (startHeight <= height);

        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, jumpsCount);
    }
}
