package com.SemiColon;
/* collect 15 scores

 */
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.print("how many grades do you want? ");
        double amount = input.nextInt();

        double sum = 0;
        double counter = 1;


        while (counter <= amount) {
             System.out.print("Enter your score ");
             double score = input.nextDouble();
             sum = sum + score;
             counter = counter + 1;
         }
         double average = sum/amount;

         System.out.println("Sum of all scores: " + sum);
         System.out.print("Average of all scores: " + average);
    }
}
