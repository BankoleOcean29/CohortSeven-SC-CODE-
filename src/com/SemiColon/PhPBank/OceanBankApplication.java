package com.SemiColon.PhPBank;

import com.chapterTwoExercises.SpacedOut;

import java.util.Scanner;

public class OceanBankApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        CustomerClass customerOne = new CustomerClass();
        CustomerClass customerTwo = new CustomerClass();

        String prompt = """
                Please enter your firstname, lastname and phone number""";
        System.out.println(prompt);

        String firstName = input.next();
        String lastName = input.next();

        customerOne.setFirstName(firstName);
        customerOne.setLastName(lastName);

        System.out.println("Reset your pin");
        int pin = input.nextInt();

        String menu = """
                Welcome!
                
                Enter 1 to Deposit
                Enter 2 to withdraw
                Enter 3 to transfer
                Enter 4 to Logout""";
        System.out.println(menu);
        int menuInput = input.nextInt();

        switch(menuInput){
            case 1:
                System.out.println("Enter amount to deposit");
                double.amountTo
        }





    }
}
