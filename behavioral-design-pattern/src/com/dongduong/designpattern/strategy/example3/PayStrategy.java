package com.dongduong.designpattern.strategy.example3;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
