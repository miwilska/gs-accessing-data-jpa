package pl.waw.sgh.bank;

/**
 * Created by prubac on 4/15/2016.
 */

public class DebitAccount extends Account {

    public DebitAccount() {
        super();
    }

    public DebitAccount(Long accountID, Customer customer) {
        super(accountID, customer);
    }


    public DebitAccount(Customer customer) {
        super(customer);
    }
}
