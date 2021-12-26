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
}
