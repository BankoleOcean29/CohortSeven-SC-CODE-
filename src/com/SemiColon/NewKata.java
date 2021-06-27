package com.SemiColon;

import com.chapterTwoExercises.SpacedOut;

import java.util.Scanner;

public class NewKata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 numbers");

        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();
        int numberFive = input.nextInt();

        System.out.println(numberFive + "" + numberFour + "" + numberThree + "" + numberTwo + "" + numberOne);
    }
}

