package edu.designpatterns.behavioral.strategy;

public interface Account {

    void makePayment(int amount);

    Account PAYPAL_ACCOUNT = (int amount) ->  System.out.println("Payment of $" + amount + " made from PayPal.");

    Account BANK_ACCOUNT = (int amount) ->  System.out.println("Payment of $" + amount + " made from bank account.");
}
