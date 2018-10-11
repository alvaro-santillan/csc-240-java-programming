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

public class Calculations {

    // Two constant data fields:
    private final double pricePound = 5.99;
        // One for the price per pound, which is $5.99
    private final double taxRate = 0.0725;
        // One for the tax rate, which is 7.25% (expressed as 0.0725)
    private int bagNum;
    private int bagWeight;

    // A no-argument constructor that creates a sale of one bag weighing one pound
    // Redundant constructor respectfully, not used by the program
    public Calculations ( ) {
        double totalPrice = pricePound;
        // Calculations will be based on the following formulas:
        // totalPriceWithTax = totalPrice + (totalPrice * taxRate)
        double totalPriceWithTax  = totalPrice + (totalPrice * taxRate);
    }

    // A constructor that accepts arguments from the first class for number of bags and the weight of each bag
    public Calculations (int bNum, int bWeight) {
        bagNum = bNum;
        bagWeight = bWeight;
    }

    // A method named getSale() that returns the sale amount before tax
    public double getSale( ) {
        // Calculations will be based on the following formulas:
        // totalPrice = bagWeight * numberOfBags * pricePerLB
        return bagWeight * bagNum * pricePound;
    }

    // A method named getSaleTax() that returns the tax on the transaction
    public double getSaleTax( ) {
        return getSale() * taxRate;
    }

    // A method named getTotalPrice() that returns the total sale price
    public double getTotalPrice( ) {
        return getSale() + getSaleTax();
    }

    // A method named getPrice() that returns the price per pound
    public double getPrice( ) {
        return pricePound;
    }

    // A method named getTaxRate() that returns the tax rate
    public double getTaxRate( ) {
        return 7.25;
    }
}