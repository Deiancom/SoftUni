package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class TripToWorldCup01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double planeTicketGo = Double.parseDouble(scanner.nextLine()) * 6;
        double planeTicketBack = Double.parseDouble(scanner.nextLine()) * 6;
        double planeSum = planeTicketBack + planeTicketGo;
        double ticketPrice = Double.parseDouble(scanner.nextLine()) * 6;
        int machNumber = scanner.nextInt();
        int discount = scanner.nextInt();
        planeSum -= planeSum * ((double) discount / 100);
        double expenses = (ticketPrice * machNumber) + planeSum;
        double pricePerPerson = expenses / 6;
        System.out.printf("Total sum: %.2f lv.%n", expenses);
        System.out.printf("Each friend has to pay %.2f lv.", pricePerPerson);
    }
}
