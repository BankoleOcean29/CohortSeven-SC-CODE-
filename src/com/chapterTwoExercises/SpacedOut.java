package com.chapterTwoExercises;

import java.util.Scanner;

public class SpacedOut {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in 5 numbers");
        int numbersIn = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();
        int numberFive = input.nextInt();

        System.out.print(numbersIn + " " + numberTwo + " " + numberThree + " " + numberFour + " " + numberFive);


    }
}
