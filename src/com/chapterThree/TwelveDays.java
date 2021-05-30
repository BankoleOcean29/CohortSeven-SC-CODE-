package com.chapterThree;

import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        String dayOne = """
                On the first day of Christmas my true love gave to me""";

        String dayTwo = """
                On the second day of Christmas my true love gave to me""";

        String dayThree = """
                On the third day of Christmas my true love gave to me""";

        String dayFour = """
                On the fourth day of Christmas my true love gave to me""";

        String dayFive = """
                On the fifth day of Christmas my true love gave to me""";

        String daySix = """
                On the sixth day of Christmas my true love gave to me""";

        String daySeven = """
                On the seventh day of Christmas my true love gave to me""";

        String dayEight = """
                On the eighth day of Christmas my true love gave to me""";

        String dayNine = """
                On the ninth day of Christmas my true love gave to me""";

        String dayTen = """
                On the tenth day of Christmas my true love gave to me""";

        String dayEleven = """
                On the eleventh day of Christmas my true love gave to me""";

        String dayTwelve = """
                On the twelfth day of Christmas my true love gave to me""";

        String giftOne = """
                A partridge in a pear tree""";

        String giftTwo = """
                Two turtle doves and a""";

        String giftThree = """
                Three French hens,""";

        String giftFour = """
                Four calling birds,""";

        String giftFive = """
                Five gold rings,""";

        String giftSix = """
                Six geese a laying,""";

        String giftSeven = """
                Seven swans a swimming,""";

        String giftEight = """
                Eight maids a milking,""";

        String giftNine = """
                Nine ladies dancing,""";

        String giftTen = """
                Ten lords a leaping,""";

        String giftEleven = """
                Eleven pipers piping,""";

        String giftTwelve = """
                Twelve drummers drumming,""";


    int sentinel = 13;
    int number = 0;

    while(sentinel != number) {
        System.out.println("Type in numbers 1 to 12 to get the verses of the twelve days of Christmas song or press 13 to exit");
        number = prompt.nextInt();

        if(number == 1) {
            System.out.println(dayOne + " " + giftOne);
        }
        if (number == 2) {
            System.out.println(dayTwo + " " + giftOne + " " + giftTwo);
        }
        if (number == 3) {
            System.out.println(dayThree + " " + giftOne + " " + giftTwo + " " + giftThree);
        }
        if (number == 4) {
            System.out.println(dayFour + " " + giftOne + " " + giftTwo + " " + giftThree + " " + giftFour);
        }
    }






    }
}
