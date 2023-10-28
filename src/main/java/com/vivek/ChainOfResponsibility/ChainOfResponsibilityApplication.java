package com.vivek.ChainOfResponsibility;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 *
 * The Chain of Responsibility pattern allows a number of classes to attempt to handle a request independently.
 *
 * Reference: https://refactoring.guru/design-patterns/chain-of-responsibility
**/

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PaypalPaymentHandler();
        bank.setNext(creditCard);
        creditCard.setNext(paypal);
        //we are calling handlePayment method from bank object as it is base handler if it is unable to
        //handle the payment then, it will pass the responsibility to the next handler and so on.
        bank.handlePayment(600);
        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(600);
    }
}
