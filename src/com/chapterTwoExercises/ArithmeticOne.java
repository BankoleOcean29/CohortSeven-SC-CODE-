package com.chapterTwoExercises;

import java.util.Scanner;

public class ArithmeticOne {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Type in two numbers");
            int firstNumberIn = input.nextInt();
            int secondNumberIn = input.nextInt();


            int sum = firstNumberIn + secondNumberIn;
            int product = firstNumberIn * secondNumberIn;
            int difference = firstNumberIn / secondNumberIn;
            int quotient = firstNumberIn % secondNumberIn;

            System.out.println("Addition of both numbers equal: " + sum);
            System.out.println("Multiplication of both numbers produce: " + product);
            System.out.println("Difference of both numbers is: " + difference);
            System.out.println("Quotient of both numbers is: " + quotient);



        }

    }