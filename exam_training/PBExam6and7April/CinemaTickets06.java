package ProgrammingBasics.exam_training.PBExam6and7April;

import java.util.Scanner;

public class CinemaTickets06 {
    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int allStudentTickets = 0;
        int allStandardTickets = 0;
        int allKidTickets = 0;
        int totalTicketsSold = 0;
        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int allTicketsForMovie = 0;

            for (int i = 0; i < freeSeats; i++) {
                String ticketType = scanner.nextLine();
                switch (ticketType) {
                    case "student":
                        totalTicketsSold++;
                        allStudentTickets++;
                        allTicketsForMovie++;
                        break;
                    case "standard":
                        totalTicketsSold++;
                        allStandardTickets++;
                        allTicketsForMovie++;
                        break;
                    case "kid":
                        totalTicketsSold++;
                        allKidTickets++;
                        allTicketsForMovie++;
                        break;
                }
                if (ticketType.equals("End")) {
                    break;
                }
            }
            double percent = (allTicketsForMovie * 100) / (double) freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percent);
            movieName = scanner.nextLine();
        }
        double studentPercent = (allStudentTickets * 100) / (double) totalTicketsSold;
        double standardPercent = (allStandardTickets * 100) / (double) totalTicketsSold;
        double kidPercent = (allKidTickets * 100) / (double) totalTicketsSold;
        System.out.printf("Total tickets: %d%n", totalTicketsSold);
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        System.out.printf("%.2f%% kids tickets.", kidPercent);
    }
}
