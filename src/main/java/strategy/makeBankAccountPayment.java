package strategy;

public class makeBankAccountPayment implements Account {
    @Override
    public void makePayment(int amount) {
         System.out.println("Payment of $" + amount + " made from bank account.");
    }
}
