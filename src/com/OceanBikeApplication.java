package com;

import java.util.Scanner;

public class OceanBikeApplication {
    public static void main(String[] args) {
        OceanBikeApplication oceanBike = new OceanBikeApplication();



        String prompt = """
               -Enter 1 for Turn on
               -Enter 2 for Accelerate
               -Enter 3 for Decelerate 
               -Enter 4 to Turn Off/Exit Application.
             
             
                """;

        System.out.println(prompt);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
    }
}
