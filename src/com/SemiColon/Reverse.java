package com.SemiColon;

public class Reverse {

    public static void main(String[] args) {

    }

    public static void reverse(int number) {
        number = 1234;
        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
    }

        public int findFactorialOfInt(int number){
            for (int i = number - 1; i > 0; i--) {
                number = number * i;

            }

            return number;
    }





}



