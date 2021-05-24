package com.chapterTwoExercises;

import java.util.Scanner;

public class DifferentOperations {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Type in three numbers");
            int firstNumberIn = input.nextInt();
            int secondNumberIn = input.nextInt();
            int thirdNumberIn = input.nextInt();

            int sum;
            int average;
            int product;

            sum = firstNumberIn + secondNumberIn + thirdNumberIn;
            average = (sum / 3);
            product =  firstNumberIn * secondNumberIn * thirdNumberIn;

            System.out.println("The sum of the numbers is: " + sum);
            System.out.println("The average of the numbers is: " + average);
            System.out.println("The product of the numbers is: " + product);

            if (firstNumberIn > secondNumberIn && firstNumberIn > thirdNumberIn) {
                System.out.println("The largest number is: " + firstNumberIn);
            }

            if (secondNumberIn > firstNumberIn && secondNumberIn > thirdNumberIn) {
                System.out.println("The largest number is: " + secondNumberIn);
            }
            if (thirdNumberIn > firstNumberIn && thirdNumberIn > secondNumberIn) {
                System.out.println("The largest number is: " + thirdNumberIn);
            }
            if (firstNumberIn < secondNumberIn && firstNumberIn < thirdNumberIn) {
                System.out.println("The smallest number is: " + firstNumberIn);
            }
            if (secondNumberIn < firstNumberIn && secondNumberIn <  thirdNumberIn) {
                System.out.println("The smallest number is: " + secondNumberIn);
            }
            if (thirdNumberIn < firstNumberIn && thirdNumberIn < secondNumberIn) {
                System.out.println("The smallest number is: " + thirdNumberIn);
            }

    }

    }

