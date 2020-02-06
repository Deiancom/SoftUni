package JavaAdvance.Defining_Classes.Lab.bank_account;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double balance;

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    BankAccount() {
        this.id = bankAccountCount++;
    }
    void deposit(double amount) {
        this.balance =+ amount;
    }
    double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
}

