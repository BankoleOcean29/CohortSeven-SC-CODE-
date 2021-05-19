package com;
/* Pseudocode

Prompt the student to type in number.
Set range to assign appropriate grade to student's score.
Define that 90 to 100 is for grade A.
Define that 80 to 89 is for grade B.
Define that 70 to 79 is for grade C.
Define that 60 to 69 is for grade D.
Define that 59 to 0 is for grade F.
Define that any score typed in that is greater than 100 is invalid.
Define that any score typed in that is less than 0 is invalid.
Set up scanner to collect student's score.
Print out students grade that corresponds with his/her score.


 */
import com.sun.source.util.SourcePositions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AlgoR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input your score:");

        int score = input.nextInt();

        if (score >= 90 && score < 101) {
            System.out.println("A, you're a G");
        } else if ( score < 90 && score > 79) {
            System.out.println("B, semi G");
        }

        if (score < 80 && score > 69) {
           System.out.println("C, semi demi G");
       }
         else if (score < 70 && score > 59) {
           System.out.println("you got a D");
       }

       if (score < 60 && score >= 0) {
           System.out.println("F...try again");
       }
       else if (score > 100) {
           System.out.println("Please input a valid score");
       }
       else if (score < 0) {
           System.out.println("Please input a valid score");
       }

    }
}
