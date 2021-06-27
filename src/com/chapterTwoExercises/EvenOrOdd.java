package com.chapterTwoExercises;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in a number and I would tell you if it's even or odd");
        int userInput = input.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("It's even");
        }

        if (userInput % 2 != 0) {
            System.out.println("It's odd");
        }

    }

}


