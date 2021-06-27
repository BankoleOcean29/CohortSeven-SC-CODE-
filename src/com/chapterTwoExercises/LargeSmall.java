package com.chapterTwoExercises;

import java.util.Scanner;

public class LargeSmall {

    public static void main(String[] args) {
        System.out.println("type in 5 numbers");

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        int larger = Math.max(number1,number2);
        int largerTwo = Math.max(number3,number4);

        int largerThree = Math.max(larger,largerTwo);

        int largerFour = Math.max(largerThree,number5);

        System.out.println(largerFour);


    }
}
