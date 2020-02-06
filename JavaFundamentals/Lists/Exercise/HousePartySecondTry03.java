package JavaFundamentals.Lists.Exercise;

import java.util.*;

public class HousePartySecondTry03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();
        for (int i = 0; i < inputNumbers; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[2].equals("going!")) {
                if (guestList.contains(command[0])) {
                    System.out.println(command[0] + " is already in the list!");
                } else {
                    guestList.add(command[0]);
                }
            } else if (command[2].equals("not")) {
                if (guestList.contains(command[0])) {
                    guestList.remove(command[0]);
                } else {
                    System.out.println(command[0] + " is not in the list!");
                }
            }
        }
        for (String s : guestList) {
            System.out.println(s);
        }
    }
}
