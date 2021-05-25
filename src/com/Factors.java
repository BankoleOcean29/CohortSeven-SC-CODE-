package com;


import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Type in two numbers");
        int counter = inputNumber.nextInt();
        int counterTwo = inputNumber.nextInt();


        while (counter > 1 &&  counter > 100) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter = counter + 1;

        }


        counterTwo = 1;
        while (counterTwo > 1 && counterTwo > 100) {
            if (counter % 3 == 0) {
                System.out.println(counterTwo);
            }

            counterTwo = counter + 1;
        }
    }

}
