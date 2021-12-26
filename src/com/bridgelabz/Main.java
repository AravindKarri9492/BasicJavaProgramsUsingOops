package com.bridgelabz;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        JavaPrograms object = new JavaPrograms();
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select which program do you want to run");
            System.out.println("1.flip coin \n" +
                    "2.leap year \n" +
                    "3.power of two \n" +
                    "4.harmonic number \n" +
                    "5.prime factors \n" +
                    "6.quotient and remainder \n" +
                    "7.exit ");
            int userChoice = scanner.nextInt();
            switch (userChoice)
            {
                case 1:
                    System.out.println("Enter how many times do you want to flip coin : ");
                    int numOfFlips = scanner.nextInt();
                    object.flip(numOfFlips);
                    break;

                case 2:
                    System.out.println("Enter a year to check leap year or not");
                    int yearToCheck = scanner.nextInt();
                    object.leapYear(yearToCheck);
                    break;

                case 3:
                    System.out.println("Enter power value: ");
                    int exponent = scanner.nextInt();
                    object.powerOfTwo(exponent);
                    break;

                case 4:
                    System.out.println("Enter harmonic value: ");
                    int number = scanner.nextInt();
                    object.harmonicNumber(number);
                    break;

                case 5:
                    System.out.println("Enter a number to get prime factors :");
                    int num = scanner.nextInt();
                    object.primeFactors(num);
                    break;

                case 6:
                    System.out.println("Enter dividend divisor: ");
                    int dividend = scanner.nextInt();
                    int divisor = scanner.nextInt();
                    object.quotientAndRemainder(dividend,divisor);
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.err.println("Enter correct value! ");
            }

        }
    }
}
