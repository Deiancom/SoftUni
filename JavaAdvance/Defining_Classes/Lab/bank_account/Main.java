package JavaAdvance.Defining_Classes.Lab.bank_account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> bankAccountMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            switch (tokens.length) {
                case 1:
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case 2:
                    double rate = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(rate);
                    break;
                case 3:
                    int id = Integer.parseInt(tokens[1]);
                    if (!bankAccountMap.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        BankAccount bankAccount1 = bankAccountMap.get(id);
                        if (tokens[0].equals("Deposit")) {
                            double amount = Double.parseDouble(tokens[2]);
                            bankAccount1.deposit(amount);
                            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                        } else {
                            int years = Integer.parseInt(tokens[2]);
                            System.out.printf("%.2f%n", bankAccount1.getInterest(years));
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
