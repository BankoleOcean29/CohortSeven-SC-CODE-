package com.SemiColon;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double counter = 0;
        double sentinelValue = -1;
        double score = 0;


        while (sentinelValue != score ) {
            System.out.println("Enter your score or press -1 to exit");
             score = input.nextDouble();

             if (sentinelValue != score){
                 sum = sum + score;
                 counter = counter + 1;
             }

        }

        System.out.println("Sum of the scores: " + sum);
        System.out.println("Average of the scores: " + sum/counter);

    }
}
