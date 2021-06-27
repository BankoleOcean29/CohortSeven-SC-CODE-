package com;


import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Type in a number");
        int counter = inputNumber.nextInt();


        while (counter > 1) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter = counter + 1;

        }

    }

}
