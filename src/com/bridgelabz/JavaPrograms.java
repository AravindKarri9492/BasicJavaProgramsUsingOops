package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

class JavaPrograms
{
    //FlipCoin
    public void flip(int numOfFlips)
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
    public void leapYear(int yearToCheck)
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
    public void powerOfTwo(int exponent)
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
    //Harmonic number
    public void harmonicNumber(int number)
    {
        double harmonicNum =0;
        if (number > 0)
        {
            for (double i=1;i<=number;i++)
            {
                harmonicNum += (1/i);
            }
            System.out.println("Nth harmonic number is :"+harmonicNum);
        }
        else
        {
            System.err.println("Enter positive value");
        }
    }
    //Prime factors
    public void primeFactors(int number)
    {
        for(int i = 2; i< number; i++)
        {
            while(number%i == 0)
            {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2)
        {
            System.out.println(number);
        }
    }
    //Quotient and remainder
    public void quotientAndRemainder(int dividend,int divisor)
    {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
    //Swapping
    public void swapTwoNumbers(int num1,int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("first number after swapping is " + num1);
        System.out.println("second number after swapping is " + num2);
    }
    //Even or Odd
    public void evenOrOdd(int number)
    {
        if (number%2 == 0)
        {
            System.out.println(number+ " is even number");
        }
        else
        {
            System.out.println(number + " is odd number");
        }
    }
    //Vowel or Consonant
    public void vowelOrConsonant(int ch)
    {
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'|| ch == 'I'|| ch == 'O' ||ch == 'U')
        {
            System.out.println(ch +" is an vowel");
        }
        else
        {
            System.out.println(ch+" is an consonant");
        }
    }
    //Largest Number
    public void largestNumber(int a ,int b ,int c)
    {
        if(a>b && a>c)
        {
            System.out.println("Largest number is :" +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest number is :" +b);
        }
        else
        {
            System.out.println("Largest number is :" +c);
        }
    }
    //Two Dimensional Array
    public void twoDimensionalArray()
    {
        Scanner scanner = new Scanner(System.in);
        int[][]  array = new int[3][3];
        for(int i=0 ; i<array.length ; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.println("Enter the Number :: ");
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("Your Entered Values are : ");
        PrintWriter pw = new PrintWriter(System.out);
        for(int i=0 ; i<array.length ; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                pw.print(array[i][j]+" ");
                pw.flush();
            }
            System.out.println();
        }
    }
    //Sum Of Three Integers
    public void sumOfThreeIntegers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array elements do you want to add ");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arrayLength;i++)
        {
            array[i]=scanner.nextInt();
        }
        boolean found = false;
        int tripletsCount =0;
        for (int i=0; i<arrayLength-2; i++)
        {
            for (int j = i + 1; j < arrayLength - 1; j++)
            {
                for (int k = j + 1; k < arrayLength; k++)
                {
                    if (array[i] + array[j] + array[k] == 0)
                    {
                        System.out.print(array[i]);
                        System.out.print(" ");
                        System.out.print(array[j]);
                        System.out.print(" ");
                        System.out.print(array[k]);
                        System.out.print("\n");
                        tripletsCount++;
                        found = true;
                    }
                }
            }
        }
    }
    //Distance
    public double measureDistance(double xCoOrdinate, double yCoOrdinate)
    {
        return Math.pow((Math.pow(xCoOrdinate , 2) + Math.pow(yCoOrdinate , 2)), 0.5);
    }
}
