package com.arnab;

import java.math.BigDecimal;

// Encapsulation
public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverDraft;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
        this.hasOverDraft = false;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if(amount.compareTo(balance) > 0){
            System.out.println("Dear customer " + name +" You don't have enough balance to withdraw your balace is: " + this.balance);
            return BigDecimal.ZERO;
        }
        if(balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
        }

        System.out.println("You successfully withdrawn : "+ amount + " from your account, now your balance is: "+ this.balance);
        return amount;
    }
}
