package com.bridgelabz;

class JavaPrograms
{
    //FlipCoin
    public static void flip(int numOfFlips)
    {
        if(numOfFlips <= 0 )
        {
            System.err.println("Enter a positive number");
        }
        else
        {
            int headCount = 0;
            for(int i=1;i<=numOfFlips;i++)
            {
                if(Math.random() < 0.5)
                {
                    headCount++;
                }
            }
            double headPercentage = (headCount * 100)/numOfFlips;
            double tailPercentage = (100 - headPercentage);
            System.out.println("Head Percentage "+headPercentage);
            System.out.println("Tail Percentage "+tailPercentage);
        }
    }
    //LeapYear
    public static void leapYear(int yearToCheck)
    {
        if(Integer.toString(yearToCheck).length() == 4)  //Ensure year length is 4
        {
            if(yearToCheck%4 == 0 && yearToCheck%100 != 0)
            {
                System.out.println(+yearToCheck+ " is leap year");
            }
            else if(yearToCheck%100 == 0 && yearToCheck%400 == 0)
            {
                System.out.println(+yearToCheck+" is leap year");
            }
            else
            {
                System.out.println(+yearToCheck+ " is not a leap year");
            }
        }
        else
        {
            System.err.println("Entered year is not valid");
        }
    }
    //power of two
    public static void powerOfTwo(int exponent)
    {
        System.out.println("==========================");
        System.out.println("i       2 to power i   ");
        System.out.println("==========================");
        //2^31 overflows an int so exponent values should be b/w o to 31
        if (exponent>=0 && exponent<31)
        {
            for (int i=0;i<=exponent;i++)
            {
                int result = (int) Math.pow(2, i);
                System.out.println(i+"            "+result);
            }
        }
        else
        {
            System.err.println("Enter a valid exponent value b/w 0 to 31");
        }
    }
}
