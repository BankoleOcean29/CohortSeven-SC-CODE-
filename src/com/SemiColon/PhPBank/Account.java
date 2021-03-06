package com.SemiColon.PhPBank;

public class Account {

    private String accountName;
    private final int accountNumber;
    private double accountBalance;
    private int accountPin;
    private static int accountGenerator;

    public Account(){
        accountGenerator++;
        this.accountNumber = accountGenerator;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }

    public double getbalance() {
        return accountBalance;
    }

    public void setBalance(double newBalance) {
        this.accountBalance = accountBalance;
    }
}