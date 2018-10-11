///////////////////////////////////////////////////////////////////////////////
//Module 2 Assignment 2 - Loan Amortization Calculator
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 6-21-2018
//Last Modified: 6-21-2018
///////////////////////////////////////////////////////////////////////////////

/*
For this assignment, you will use a loop structure to create a loan amortization
schedule based on user input for loan amount (principal), the number of months
of the loan period and the interest rate (expressed as an annual percentage
rate, or APR). The program will display the monthly payment and the total of
all payments as shown in the sample output.
*/

// Be careful to write your code using proper formatting, including a header,
// appropriate indentation and adequate code comments.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char redo;

        // Introduction text seen only one time
        System.out.println("Welcome to the Loan Amortization Program of XYZ Banking");
        System.out.println("This program will help you determine the payment structure");
        System.out.println("    of your loan.");
        System.out.println("Let us get started:\n");

        do {
            DecimalFormat twoDeci;
            twoDeci = new DecimalFormat("#.##");
                // In the output, show no answer with more than two decimal places.

            // Get and format user input
            Scanner doubles = new Scanner(System.in);
                // Scanner 1 to listen for number input from System.in
            System.out.print("Enter the loan amount you are requesting: $ ");
            double presentValue = doubles.nextFloat();
            System.out.print("Enter the number of months for the loan: ");
            double numberOfPeriods = doubles.nextFloat();
            System.out.print("Enter the APR you have been quoted: ");
            double ratePerPeriodPercent = doubles.nextFloat();
            double ratePerPeriodDecimal = ratePerPeriodPercent/1200;
            System.out.println();

            // Calculate and display total and monthly payment results
            double paymentMonthly = (ratePerPeriodDecimal*presentValue) / (1-Math.pow((1+ratePerPeriodDecimal),-numberOfPeriods));
                // Formula, heart of calculator
            double paymentTotal = paymentMonthly * numberOfPeriods;
            System.out.println("The monthly payment will be: $" + twoDeci.format(paymentMonthly));
            System.out.println("The total paid (with interest) will be: $" + twoDeci.format(paymentTotal) + "\n");

            // Calculate and display amortization schedule
            System.out.println("Your Amortization Schedule\n");
            System.out.println("Payment# " + "   " + "Interest " + "   " + "Principal " + "   " + "Balance ");
                // Displayed once

            for (int i=1; i<=numberOfPeriods; i++) {
                double amorIntrest = ratePerPeriodDecimal * presentValue;
                double amorPrincipal = paymentMonthly - amorIntrest;
                double amorBalance = presentValue - amorPrincipal;
                presentValue = amorBalance;
                    // Line above is the key to the loop, lets us cycle our new values into the loop.

                System.out.println(i + "           $" + twoDeci.format(amorIntrest) + "      $" +
                twoDeci.format(amorPrincipal) + "      $" +  twoDeci.format(amorBalance));
            }
            System.out.println();

            // Ask to do calculation again
            Scanner characters = new Scanner(System.in);
                // Scanner 2 to listen for character input from System.in
            System.out.print("Would you like to calculate another loan (Y/N): ");
            redo = characters.next().trim().charAt(0);
            System.out.println();
        } while (redo == 'Y' || redo == 'y');
            // The program should continuously allow users to enter data and generate new loan
            // information until they enter an appropriate sentinel value.

        // Exit
        System.out.println("Thank you for using the Loan Amortization Program of XYZ Banking.");
        System.out.println("Goodbye.");
        System.exit(0);
        // The program should also use good user dialog.
    }
}