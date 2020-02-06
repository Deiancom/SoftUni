package JavaFundamentals.ExamsPreparation.FinalExams.FinalExam03AugustGroup1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> userSum = new TreeMap<>();
        Map<String, Integer> nameReceived = new LinkedHashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Statistics")) {
                break;
            }
            String[] tokens = input.split("=");
            String command = tokens[0];
            if (command.equals("Add")) {
                String name = tokens[1];
                int sent = Integer.parseInt(tokens[2]);
                int received = Integer.parseInt(tokens[3]);
                userSum.putIfAbsent(name, sent + received);
                nameReceived.putIfAbsent(name, received);
            } else if (command.equals("Message")) {
                String sender = tokens[1];
                String receiver = tokens[2];
                if (userSum.containsKey(sender) && userSum.containsKey(receiver)) {
                    int currentSum = userSum.get(sender);
                    int currentReceive = nameReceived.get(receiver);
                    userSum.put(sender, currentSum + 1);
                    userSum.put(receiver, currentSum + 1 );
                    nameReceived.put(receiver, currentReceive + 1 );
                    if (userSum.get(sender) >= capacity) {
                        userSum.remove(sender);
                        System.out.printf("%s reached the capacity!", sender);
                    }
                    if (userSum.get(receiver) >= capacity) {
                        userSum.remove(receiver);
                        System.out.printf("%s reached the capacity!", receiver);
                    }
                }
            } else if (command.equals("Empty")) {
                String name = tokens[1];
                if (name.equals("All")) {
                    for (int i = 0; i < userSum.size() ; i++) {

                    }
                }
            }
        }
    }
}
