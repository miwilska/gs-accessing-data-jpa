package bank.exceptions;

/**
 * Created by prubac on 4/22/2016.
 */
public class AccountNotFoundException extends BankException {

    public AccountNotFoundException(String message) {
        super(message);
    }
}
