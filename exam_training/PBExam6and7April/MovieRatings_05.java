package ProgrammingBasics.exam_training.PBExam6and7April;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviesNumber = Integer.parseInt(scanner.nextLine());
        String highRatedMovie = "";
        double highRating = 0;
        String lowRatedMovie = "";
        double lowestRating = 10;
        double ratingCount = 0;
        for (int i = 0; i < moviesNumber; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingCount += rating;
            if (rating > highRating) {
                highRating = rating;
                highRatedMovie = movieName;
            }
            if (rating < lowestRating) {
                lowestRating = rating;
                lowRatedMovie = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", highRatedMovie, highRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowRatedMovie, lowestRating);
        System.out.printf("Average rating: %.1f", ratingCount / moviesNumber);
    }
}
