package com.vivek.ChainOfResponsibility;

public class PaypalPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if(amount <= 1500){
            System.out.println("Paid using Paypal: $"+amount);
        }else{
            next.handlePayment(amount);
        }
    }
    
}
