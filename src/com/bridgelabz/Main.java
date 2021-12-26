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
                    "3.exit ");
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
                    System.exit(0);
            }

        }
    }
}
