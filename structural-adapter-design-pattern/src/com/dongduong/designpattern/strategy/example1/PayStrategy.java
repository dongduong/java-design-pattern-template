package com.dongduong.designpattern.strategy.example1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
