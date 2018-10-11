///////////////////////////////////////////////////////////////////////////////
//Module 3 Assignment 2 – Inventory Tracker Program
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 7-3-2018
//Last Modified: 7-6-2018
///////////////////////////////////////////////////////////////////////////////

/*
For this assignment, you will design a program that will use a loop to accept
the names of ten items and the raw cost of each item. The names and the item raw
costs will be stored in two parallel arrays. The program will then output the
names or the items, item raw costs and item prices (calculated using the formula
itemCost(x) * 1.3) in table form with the column title "Item Name" above the names,
the title "Item Cost" above the raw costs and the title "Item Price" above the prices.
*/

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {

    // Your program will have at least six methods:
    // 1. The main method that coordinates the program's function.
    public static void main(String[] args) {
        welcome();
        choice();
    }

    // 2. A method that greets the user and provides brief instructions.
    private static void welcome() {
        System.out.println("Welcome to the Inventory Tracker Program");
        System.out.println("This program will accept the names and costs for 10 stocked items.");
        System.out.println("The program will then output a table with the names, costs, and prices");
        System.out.println("    of the items.");
        System.out.println("Prices are calculated with a 30% markup on cost.\n");
    }

    // 3. A method which controls when the data entry begins.
    private static void choice() {
        // The user will control when the data entry begins.
        System.out.print("Enter B to begin, E to end: ");
        Scanner characters = new Scanner(System.in);
        char beginEnd = characters.next().trim().charAt(0);
        System.out.println();

        if(beginEnd == 'B' || beginEnd == 'b') {
            table();
        } else if (beginEnd == 'E' || beginEnd == 'e') {
            terminate();
        }
    }

    // 4. A method that prompts for and accepts input from the user.
    private static void table() {
        // You will require two parallel arrays for the input.
        String[] itemName = new String[10];
        double[] itemCost = new double[10];
        double[] itemSale = new double[10];

        // Format output
        DecimalFormat twoDeci;
        twoDeci = new DecimalFormat("#.##");

        Scanner characters = null;
        Scanner doubles = null;
        for (int i = 1; i < 11; i++) {
            // Takes product name
            characters = new Scanner(System.in);
            System.out.print("Enter product " + i + " name: ");
            itemName[i - 1] = characters.next();

            // Takes item cost
            doubles = new Scanner(System.in);
            System.out.print("Enter the item cost: $");
            itemCost[i - 1] = Double.parseDouble(twoDeci.format(doubles.nextFloat()));
            System.out.println();

            // Calculate item sale price
            itemSale[i - 1] = Double.parseDouble(twoDeci.format((itemCost[i - 1] * 1.3)));

        }
        characters.close();
        doubles.close();

        // (Hint: Use an accumulator.) Do not use a separate loop to complete this part of the task.
        double totalCost = Double.parseDouble(twoDeci.format(DoubleStream.of(itemCost).sum()));

        tableOutputs(itemSale, itemCost, itemName, totalCost);
    }

    // 5. A method that outputs the table.
    private static void tableOutputs(double[] itemSale, double[] itemCost, String[] itemName, double totalCost) {

        System.out.println("Inventory Table:");
        System.out.println();
        System.out.println("Item Name   Item Cost   Item Price");

        for (int i = 1; i<11; i++) {
            System.out.println(itemName[i-1] + "    $" + itemCost[i-1] + "    $" + itemSale[i-1]);
        }

        // You will output the total cost of goods at the bottom of the table.
        System.out.println();
        System.out.println("Total cost of goods: $" + totalCost);
        System.out.println();

        terminate();
    }

    // 6. A method that thanks the user and says goodbye.
    private static void terminate() {
        // Your program will end when the table output is complete and the user has been thanked.
        System.out.println("Thank you for using the Inventory Tracker Program.  Goodbye.");
        System.exit(0);
    }
}