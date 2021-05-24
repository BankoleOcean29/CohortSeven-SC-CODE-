package com.chapterTwoExercises;

import java.util.Scanner;

public class ComparisonOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in three numbers");
        int firstNumberIn = input.nextInt();
        int secondNumberIn = input.nextInt();
        int thirdNumberIn = input.nextInt();
        int fourthNumberIn = input.nextInt();
        int fifthNumberIn = input.nextInt();

        if (firstNumberIn > secondNumberIn && firstNumberIn > thirdNumberIn && firstNumberIn > fourthNumberIn && firstNumberIn > fifthNumberIn) {
            System.out.println(firstNumberIn + " is the largest number");
        }
        if (secondNumberIn > firstNumberIn && secondNumberIn > thirdNumberIn && secondNumberIn > fourthNumberIn && secondNumberIn > fifthNumberIn ) {
            System.out.println(secondNumberIn + " is the largest number");
        }
        if (thirdNumberIn > firstNumberIn && thirdNumberIn > secondNumberIn && thirdNumberIn > fourthNumberIn && thirdNumberIn > fifthNumberIn) {
            System.out.println(thirdNumberIn + " is the largest number");
        }
        if (fourthNumberIn > firstNumberIn && fourthNumberIn > secondNumberIn && fourthNumberIn > thirdNumberIn && fourthNumberIn > fifthNumberIn) {
            System.out.println(fourthNumberIn + " is the largest number");
        }





    }
}
