package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String languages = "";
        if (country.equals("USA") || country.equals("England")) {
           languages = "English";
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            languages = "Spanish";
        } else {
            languages = "unknown";
        }
        System.out.print(languages);
    }
}
