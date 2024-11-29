
public class WithdrawalTransaction extends BaseTransaction {
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) throws InsufficientFundsException {
        if (ba.getBalance() < getAmount()) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        ba.withdraw(getAmount());
        System.out.println("Withdrawal Successful. New Balance: " + ba.getBalance());
    }
}
