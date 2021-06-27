package com.chapterTwoExercises;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight, height;

        System.out.println("Enter your weight(in kilograms)");
        weight = input.nextDouble();

        System.out.println("Enter your height(in meters)");
        height = input.nextDouble();

        double Bmi = weight/(height * height);

        if (Bmi < 18.5) {
            System.out.println("Underweight");
        }
        if (Bmi > 18.4 && Bmi < 25) {
            System.out.println("Normal");
        }
        if (Bmi > 24.9 && Bmi < 30) {
            System.out.println("Overweight");
        }
        if (Bmi >= 30) {
            System.out.println("Obese");
        }

    }
}
