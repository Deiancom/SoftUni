package JavaFundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            String[] tokens = input.split(" \\| ");
            String command = tokens[0];

            switch (command) {
                case "Add Book": {
                    String book = tokens[1];
                    if (!books.contains(book)) {
                        books.add(0, tokens[1]);
                    }
                    break;
                }
                case "Take Book":
                    books.remove(tokens[1]);

                    break;
                case "Swap Books":
                    if (books.contains(tokens[1]) && books.contains(tokens[2])) {
                        String backup = tokens[2];
                        int index1 = books.indexOf(tokens[1]);
                        int index2 = books.indexOf(tokens[2]);
                        books.set(index2, tokens[1]);
                        books.set(index1, backup);
                    }
                    break;
                case "Insert Book": {
                    String book = tokens[1];
                    books.add(book);
                    break;
                }
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < books.size()) {
                        String name = books.get(index);
                        System.out.println(name);
                    }
                    break;
            }
        }
        for (int i = 0; i < books.size(); i++) {
            if (i < books.size() - 1) {
                System.out.print(books.get(i) + ", ");
            } else {
                System.out.print(books.get(i));
            }
        }
    }
}
