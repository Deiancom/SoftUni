package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Spaceship_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double astronautHeight = Double.parseDouble(scanner.nextLine());
        double spaceCraftArea = width * length * height;
        double roomArea = (astronautHeight + 0.40) * 2 * 2;
        double allSpace = Math.floor(spaceCraftArea / roomArea);
        if (allSpace < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (allSpace > 10) {
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.printf("The spacecraft holds %.0f astronauts.", allSpace);
        }


    }
}
