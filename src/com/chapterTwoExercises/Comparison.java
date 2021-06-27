package com.chapterTwoExercises;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in two numbers");
        int firstNumberIn = input.nextInt();
        int secondNumberIn = input.nextInt();

        if (firstNumberIn > secondNumberIn) {
            System.out.println(firstNumberIn + " is larger than " + secondNumberIn);
        }
        if  (secondNumberIn > firstNumberIn) {
            System.out.println(secondNumberIn + " is larger than " + firstNumberIn);
        }

        if (firstNumberIn == secondNumberIn)  {
            System.out.println("These numbers are equal");
        }
    }
}
