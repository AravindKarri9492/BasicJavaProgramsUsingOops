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
}
