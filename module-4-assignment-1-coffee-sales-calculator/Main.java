///////////////////////////////////////////////////////////////////////////////
//Module 4 Assignment 1 - Coffee Sales Calculator
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 7-9-2018
//Last Modified: 7-12-2018
//Files: Main.java, Calculations.java
///////////////////////////////////////////////////////////////////////////////

/*
For this assignment, you will write a program that accepts the unit weight of a bag of
coffee, in pounds, and the number of bags sold. The program will then display the current
date, the number of bags sold, the weight per bag, the price per pound, the tax rate
used, the subtotal, the tax charged and the total price of the sale.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    // The main method
    public static void main(String[] args) {
        int transactCount = 0;
        greeting( );
        input(transactCount);
    }

    // A method for greeting the user when the program begins
    private static void greeting( ) {
        System.out.println("Welcome to the Coffee Sales Tracker\n");
        System.out.println("This program will calculate the amount due");
        System.out.println("for your coffee sales transactions\n");
    }

    // A method for user input for the bag weight and number of bags
    private static void input(int transactCount) {
        Scanner characters = new Scanner(System.in);
        Scanner ints = new Scanner(System.in);

        // The program will calculate sales until the user indicates that there are no further sales.
        if (transactCount == 0) {
            System.out.print("Are you ready to begin Y/N? ");
        } else if (transactCount != 0) {
            System.out.print("Do you have another sale to ring up Y/N? ");
        }
        char startChoice = characters.next().trim().charAt(0);
        System.out.println();

        if (startChoice == 'Y' || startChoice == 'y') {
            System.out.print("Number of bags: ");
            int bagNum = ints.nextInt();
            System.out.print("Weight per bag: ");
            int bagWeight = ints.nextInt();
            System.out.println();
            output(bagNum, bagWeight);
        } else if (startChoice == 'N' || startChoice == 'n') {
            terminate( );
        }
        characters.close();
        ints.close();
    }

    // A method that handles output for the results
    private static void output(int bagNum, int bagWeight) {
        // The results will include the current date calculated using the built-in Date class.
        // Align the output as shown in the output referenced later in these instructions.
        Calculations calcObj = new Calculations (bagNum, bagWeight);
        String textFormat = "%-30s %s \r\n";

        // Format date (Month Day, Year)
        System.out.format(textFormat, "Today’s date: ", new SimpleDateFormat("MMMM d, yyyy").format(Calendar.getInstance().getTime()));
        System.out.format(textFormat, "Number of bags:", bagNum);
        System.out.format(textFormat, "Weight per bag:", bagWeight + " pounds");
        System.out.format(textFormat, "Price per pound:", "$" + calcObj.getPrice());
        System.out.format(textFormat, "Sales tax:", calcObj.getTaxRate() + "%");
        // All output will be limited to two decimal places.
        System.out.format(textFormat, "Sales sub-total:", "$" + String.format("%.2f",calcObj.getSale()));
        System.out.format(textFormat, "Total tax:", "$" + String.format("%.2f",calcObj.getSaleTax()) + "\n");
        System.out.format(textFormat, "Total Sale:", "$" + String.format("%.2f", calcObj.getTotalPrice()) + "\n");

        // Trip loop in input()
        int transactCount = 1;
        input(transactCount);
    }

    // A method for output of a message that is displayed when the user is done calculating coffee sales
    private static void terminate( ) {
        System.out.println("Thank you and have a great day.  Goodbye.");
        System.exit(0);
    }
}