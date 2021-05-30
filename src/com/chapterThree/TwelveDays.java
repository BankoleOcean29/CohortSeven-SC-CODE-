package com.chapterThree;

public class TwelveDays {

    public static void main(String [] args)
    {

        for(int verse=1; verse<=12;verse++)
        {
            System.out.print("On the ");

            switch(verse)
            {
                case 1:
                    System.out.print("First");
                    break;

                case 2:
                    System.out.print("Second");

                case 3:
                    System.out.print("Third");
                    break;

                case 4:
                    System.out.print("Fourth");
                    break;

                case 5:
                    System.out.print("Fifth");
                    break;

                case 6:
                    System.out.print("Sixth");
                    break;

                case 7:
                    System.out.print("Seventh");
                    break;

                case 8:
                    System.out.print("Eighth");
                    break;

                case 9:
                    System.out.print("Ninth");
                    break;

                case 10:
                    System.out.print("Tenth");
                    break;

                case 11:
                    System.out.print("Eleventh");
                    break;

                case 12:
                    System.out.print("Twelfth");
                    break;

            }

            System.out.println(" day of Christmas my true love gave to me ");


            switch(verse)
            {
                case 12:
                    System.out.println(" twelve Drummers Drumming ");

                case 11:
                    System.out.println(" eleven Pipers piping ");

                case 10:
                    System.out.println(" ten Lords a leaping ");

                case 9:
                    System.out.println("nine Ladies Dancing ");

                case 8:
                    System.out.println(" eight Maids a milking ");

                case 7:
                    System.out.println(" seven Swans a swimming ");

                case 6:
                    System.out.println(" six Geese a laying ");

                case 5:
                    System.out.println(" five Golden Rings ");

                case 4:
                    System.out.println(" four Calling Birds ");

                case 3:
                    System.out.println(" three French Hens ");

                case 2:
                    System.out.println(" two Turtle Doves ");

                case 1:
                    System.out.println(" A partridge in a pear tree ");

            }

        }

    }
}