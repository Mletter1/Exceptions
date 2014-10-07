/**
 * Created by matthewletter on 9/15/14.
 */
public class BankAccount {
    private int accountNumber;
    private double balance = 0;

    /**
     * sets the account number
     * @param accountNumber
     */
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * get Balance
     * @return double balance
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * set deposite
     * @param deposite
     */
    public void deposit(double deposite){
        this.balance += deposite;
    }

    /**
     * get account number
     * @return account number
     */
    public int getAccountNumber(){
        return this.accountNumber;
    }

    /**
     * apply withdraw value to the balance
     * @param withdraw
     * @throws InsufficientFundsException
     */
    public void withdraw(double withdraw) throws InsufficientFundsException{
        double balanceTest = this.balance - withdraw;
        if(balanceTest<0){
            throw new InsufficientFundsException(withdraw - this.balance);
        }else{
            this.balance -= withdraw;
        }
    }
}
