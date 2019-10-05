package com.company;

import java.util.Scanner;  // Needed for the Scanner class

/**
 This program calculates the user's gross pay.
 */

public class Pay
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Identifier declarations
        int quantity;
        double hours;  // Number of hours worked
        double rate;   // Hourly pay rate
        double pay;    // Gross pay

        // Display prompts and get input.
        //System.out.print("How many hours did you work? ");
        //hours = keyboard.nextDouble();
        //System.out.print("How much are you paid per hour? ");
        //rate = keyboard.nextDouble();
        quantity=keyboard.nextInt();
        double mod=quantity%3;
        System.out.println(mod);
        // Perform the calculations.
       /* if(hours <= 40)             //if the number of worked hours is less than or equal to 40
            pay = hours * rate;     //then the gross pay is equal to the number of worked hours times pay rate.
        else                                                //otherwise
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;  //the gross pay equal to worked hours minus 40 times the product of 1.5 and
                                                            //rate then plus the product of 40 and pay rate.

        // Display results.
        System.out.println("You earned $" + pay);
        */

    }
}