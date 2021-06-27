package com.chapterTwoExercises;

import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double min = -5000;
        double max = 10000;

        double random_int = (double)Math.floor(Math.random()*(max-min+1)+min);
        double randomIntTwo = (double)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("What is the sum of " + random_int + " and " + randomIntTwo);
        double answer = input.nextDouble();
        double sum = random_int + randomIntTwo;

        if (answer == sum){
            System.out.println("Correct!");
        }
        else {
            System.out.println("wrong answer, try again");
        }

    }
}
