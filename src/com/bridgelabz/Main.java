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
            System.out.println("1.flip coin \t" +
                    "2.leap year \t" +
                    "3.power of two \t" +
                    "4.harmonic number \n" +
                    "5.prime factors \t" +
                    "6.quotient and remainder \t" +
                    "7.swapping two numbers \t" +
                    "8.even or odd \t" +
                    "9.vowel or consonant \n" +
                    "10.largest number \t" +
                    "11.two dimensional array \t" +
                    "12.sum of three integers \t" +
                    "13.euclidean distance \t" +
                    "14.exit ");
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
                    System.out.println("Enter two numbers to perform swapping : ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    object.swapTwoNumbers(num1,num2);
                    break;

                case 8:
                    System.out.println("Enter a number to check even or odd : ");
                    int number1 = scanner.nextInt();
                    object.evenOrOdd(number1);
                    break;

                case 9:
                    System.out.println("Enter an alphabet to check it is vowel or consonant :");
                    char ch = scanner.next().charAt(0);
                    object.vowelOrConsonant(ch);
                    break;

                case 10:
                    System.out.print("Enter the first number :");
                    int a = scanner.nextInt();
                    System.out.print("Enter the second number :");
                    int b = scanner.nextInt();
                    System.out.print("Enter the third number :");
                    int c = scanner.nextInt();
                    object.largestNumber(a,b,c);
                    break;

                case 11:
                    object.twoDimensionalArray();
                    break;

                case 12:
                    object.sumOfThreeIntegers();
                    break;

                case 13:
                    System.out.println("Enter X coordinate ::");
                    double xCoOrdinate = scanner.nextDouble();
                    System.out.println("Enter Y coordinate ::");
                    double yCoOrdinate = scanner.nextDouble();
                    double distance = object.measureDistance(xCoOrdinate,yCoOrdinate);
                    System.out.format("The distance of (%.2f , %.2f) from origin is %.2f" ,
                            xCoOrdinate , yCoOrdinate , distance);
                    break;

                case 14:
                    System.exit(0);

                default:
                    System.err.println("Enter correct value! ");
            }

        }
    }
}
