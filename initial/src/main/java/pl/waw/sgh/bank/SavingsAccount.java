package pl.waw.sgh.bank;

/**
 * Created by prubac on 4/15/2016.
 */

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Long accountID, Customer customer) {
        super(accountID, customer);
    }

    public SavingsAccount(Customer customer) {
        super(customer);
    }

}
