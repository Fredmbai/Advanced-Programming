
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance

        Calendar date = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(1000, date, "D001");
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(2000, date, "W001");

        deposit.apply(account); // Test deposit
        withdrawal.apply(account); // Test withdrawal

        // Reverse withdrawal
        boolean reversed = withdrawal.reverse(account);
        if (reversed) {
            System.out.println("Transaction reversed successfully.");
        }
    }
}
