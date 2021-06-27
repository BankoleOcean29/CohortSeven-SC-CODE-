package com.SemiColon.PhPBank;

public class Account {

    private String accountName;
    private int accountNumber;
    private double accountBalance;
    private int accountPin;
    private static int accountGenerator;

    public Account(String accountName, String accountNumber, double accountBalance, int accountPin) {
        accountGenerator++;
        this.accountName = accountName;
        this.accountNumber = accountGenerator;
        this.accountBalance = accountBalance;
        this.accountPin = accountPin;
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
}