package com.chapterTwoExercises;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in two numbers");
        int userInput = input.nextInt();
        int userInput02 = input.nextInt();

        if (userInput % userInput02 == 0) {
            System.out.println(userInput02 + " is a multiple of " + userInput);
        }
        if (userInput02 % userInput == 0) {
            System.out.println(userInput + " is a multiple of " + userInput02);
        }
        if (userInput % userInput02 != 0) {
            System.out.print(userInput02 + " is not a multiple of " + userInput);
        }
        if (userInput02 % userInput != 0) {
            System.out.print(userInput + " is not a multiple of " + userInput02);
        }


    }
}
