package strategy;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(Account.BANK_ACCOUNT, 150);
    Account.PAYPAL_ACCOUNT.makePayment(100);
    Account.BANK_ACCOUNT.makePayment(100);
  }

}
