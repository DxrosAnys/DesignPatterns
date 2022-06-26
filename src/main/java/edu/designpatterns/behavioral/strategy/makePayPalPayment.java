package edu.designpatterns.behavioral.strategy;

public class makePayPalPayment implements Account {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }
}
