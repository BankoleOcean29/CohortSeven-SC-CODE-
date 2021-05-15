package com.eCommerce;

public class Account {
    private String accountName;
    private String accountPassword;
    private String emailAddress;
    
    public void setAccountName(String accountName1) {
        this.accountName = accountName1;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountPassword(String paswd) {

        this.accountPassword = paswd;
    }

    public String getPassword() {
        return accountPassword;
    }


    public void setEmailAddress(String solar) {

        this.emailAddress = solar;

    }
    public String getEmail() {
        return emailAddress;
    }
}

