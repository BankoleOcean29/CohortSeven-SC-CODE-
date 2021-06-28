package com.SemiColon.PhPBank;

public class CustomerClass {

    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private Account newAccount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getNewAccount() {
        return newAccount;
    }

    public void setNewAccount(Account newAccount) {
        this.newAccount = newAccount;
    }

    public void deposit(double amount) {
        double accountBalance = newAccount.getbalance();
        double newBalance = accountBalance + amount;
        newAccount.setBalance(newBalance);

    }

    public void withdraw(int accountPin, int amount) {
        double accountBalance = newAccount.getAccountBalance();
        if (accountPin == newAccount.getAccountPin()) {
        double newAccountBalance = accountBalance - amount;
        newAccount.setAccountBalance(newAccountBalance);

    } else {
            System.out.println("Invalid pin");
        }
    }

    public void transfer (int otherAccount, double amount, int pin) {

    }
}
