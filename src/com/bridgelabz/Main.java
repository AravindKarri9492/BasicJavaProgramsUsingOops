package com.bridgelabz;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        JavaPrograms object = new JavaPrograms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times do you want to flip coin : ");
        int numOfFlips = scanner.nextInt();
        scanner.close();
        object.flip(numOfFlips);
    }
}
