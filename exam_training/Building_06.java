package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        char t = 'L';

        for (int currentFloor = floors; currentFloor > 0; currentFloor--) {
            for (int currentNum = 0; currentNum < rooms; currentNum++) {
                if (currentFloor < floors) {
                    if (currentFloor % 2 == 0) {
                        t = 'O';
                    } else {
                        t = 'A';
                    }
                }
                System.out.printf("%c%d%d ", t, currentFloor, currentNum);

            }
            System.out.println(" ");
        }
    }
}

