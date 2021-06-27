package com.SemiColon;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter");

    }

   /* private static void findEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("even evil");
        }
            else
                System.out.println("odd bob");

    } */

    private static void convertToBinary(int numberB) {
        System.out.println("enter number");
        Scanner scScan = new Scanner(System.in);
        int userInput = scScan.nextInt();

        int qOne = userInput / 2;
        int qTwo = qOne / 2;

        System.out.println(qTwo + qOne);
    }

}

