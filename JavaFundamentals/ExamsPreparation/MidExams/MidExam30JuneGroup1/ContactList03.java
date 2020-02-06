package JavaFundamentals.ExamsPreparation.MidExams.MidExam30JuneGroup1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> contactList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        while (true) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            if (command.equals("Add")) {
                int index = Integer.parseInt(tokens[2]);
                if (!contactList.contains(tokens[1])) {
                    contactList.add(tokens[1]);
                } else {
                    if (isIndexValid(contactList, index)) {
                        contactList.add(index, tokens[1]);
                    }
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (isIndexValid(contactList, index)) {
                    contactList.remove(index);
                }
            } else if (command.equals("Export")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int count = Integer.parseInt(tokens[2]);
                if (startIndex >= 0 ) {
                    if (startIndex + count < contactList.size()) {
                        for (int i = startIndex; i < count + startIndex; i++) {
                            System.out.print(contactList.get(i) + " ");
                        }
                        System.out.println();
                    } else {
                        for (int i = startIndex; i < contactList.size(); i++) {
                            System.out.print(contactList.get(i) + " ");
                        }
                        System.out.println();
                    }
                }

            } else if (command.equals("Print")) {
                if (tokens[1].equals("Normal")) {
                    System.out.print("Contacts: ");
                    for (int i = 0; i < contactList.size(); i++) {
                        System.out.print(contactList.get(i) + " ");
                    }
                    return;
                } else {
                    Collections.reverse(contactList);
                    System.out.println("Contacts: ");
                    for (int i = 0; i < contactList.size(); i++) {
                        System.out.print(contactList.get(i) + " ");
                    }
                    return;
                }
            }
        }
    }

    private static boolean isIndexValid(List<String> contact, int index) {
        return index >= 0 && index < contact.size();
    }
}
