package bank;

import bank.exceptions.IllegalDataException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by prubac on 4/15/2016.
 */
@Entity
public abstract class Account {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long accountID;

  private Customer customer;

  private BigDecimal balance;


  public Account() {
  }

  public Account(Long accountID, Customer customer) {
    this.accountID = accountID;
    this.customer = customer;
    this.balance = new BigDecimal(0);
  }

  public Account(Customer customer) {
    this.customer = customer;
    this.balance = new BigDecimal(0);
  }

  public Long getAccountID() {
    return accountID;
  }

  public void setAccountID(Long accountID) {
    this.accountID = accountID;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public void deposit(BigDecimal amount) throws IllegalDataException {
    if (amount.compareTo(new BigDecimal(0)) <= 0) {
      throw new IllegalDataException(
          "Can't deposit on Account ID: "
              + accountID
              + " negative amount: " + amount);
    }
    this.balance = balance.add(amount);
  }

  public void charge(BigDecimal amount) throws IllegalDataException {
    if (amount.compareTo(new BigDecimal(0)) <= 0) {
      throw new IllegalDataException(
          "Can't charge Account ID: "
              + accountID
              + " negative amount: " + amount);
    }

    balance = balance.subtract(amount);
  }


  @Override
  public String toString() {
    return this.getClass().getSimpleName()
        .replace("Account", "") + "{"
        + "ID=" + accountID
        + ", " + balance.setScale(2, RoundingMode.HALF_EVEN)
        + ", customer=" + customer.getLastName()
        + '}';
  }
}
