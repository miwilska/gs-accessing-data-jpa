package bank;

import javax.persistence.*;

/**
 * Created by prubac on 4/15/2016.
 */
@Entity
@Table(name = "KLIENCI")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerID;

  private String firstName;

  private String lastName;

  protected Customer() {
  }

  public Customer(Long customerID,
                  String firstName,
                  String lastName) {
    this.customerID = customerID;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Customer(String firstName,
                  String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Long getCustomerID() {
    return customerID;
  }

  public void setCustomerID(Long customerID) {
    this.customerID = customerID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Customer{" +
        + customerID + ", "
        + firstName + ", "
        + lastName + '}';
  }
}
