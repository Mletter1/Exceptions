/**
 * Created by matthewletter on 9/15/14.
 * thrown if there is a shortfall in a bank account
 */
public class InsufficientFundsException extends Exception {
    private double shortFall;

    /**
     * sets the shortfall in the account
     * @param shortFall
     */
    public InsufficientFundsException(double shortFall){
        this.shortFall= shortFall;
    }

    /**
     * get the ammount of the shortfall on the account
     * @return
     */
    public double getAmount(){
        return this.shortFall;
    }
}
