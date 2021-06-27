package com.chapterFourExercises;

import java.util.Scanner;

public class HighAndLow {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;


        System.out.println("Enter ten numbers");

        for (int i = 1; i < 11; i++) {

        int numberIn = input.nextInt();

        if (max < numberIn)
            max = numberIn;

        if (min > numberIn)
            min = numberIn;

        }

        System.out.println("Highest number is " + max);

        System.out.println("Lowest number is " + min);


    }
}
