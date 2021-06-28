package com.SemiColon.PhPBank;

import java.util.ArrayList;

public class BankApp {

    private static String bankName = "OceanWealth Fund";
    ArrayList<CustomerClass> customers;

    public void register (CustomerClass customer){
        customers.add(customer);
    }

    public boolean login(int accountNumber, int pin){
        for (CustomerClass customer: customers) {
            if (customer.getCustomerAccountNumber()==accountNumber){
                if(customer.getPin() == pin){
                    return true;
                }
            }
        }
        return false;
    }

    public void transfer(int myAccountNumber,int recipient, double amount, int pin){
        if(login(myAccountNumber,pin)){
            for(CustomerClass beneficiary : customers){
                if (beneficiary.getCustomerAccountNumber() == recipient){
                    if (getCustomer(myAccountNumber).getNewAccount().getAccountBalance() > amount){
                        getCustomer(myAccountNumber).withdraw(amount, pin);
                        beneficiary.deposit(amount);
                        break;
                    }
                }
            }
        }
    }

    private CustomerClass getCustomer(int accNumber){
        for (CustomerClass customer : customers) {
            if (customer.getCustomerAccountNumber() == accNumber) {
                return customer;
            }
        }

        throw new NullPointerException("Account not found");
    }
}
