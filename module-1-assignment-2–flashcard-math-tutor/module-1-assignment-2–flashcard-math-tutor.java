///////////////////////////////////////////////////////////////////////////////
//Module 2 Assignment 1 - Java Math Calculator
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 6-4-2018
//Last Modified: 6-4-2018
///////////////////////////////////////////////////////////////////////////////

/*
For this assignment, you will write a program for use by elementary
school children. It will calculate addition, subtraction, multiplication
and division. The program will ask for the first digit, the second
digit and the operation to be performed (not necessarily in that order).
It will display the answer to the problem after the last item is entered.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        The program should also use good user dialog. Remember, this program is for an audience of
        elementary school children, so be sure to provide very clear instructions and make all
        user dialog age appropriate.
        */
        System.out.println("Welcome to the BuzyBot Calculator");
        System.out.println("We will now perform a BuzyBot calculation:");

        //Scanner 1 to listen for numerical input from System.in
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNum = numbers.nextFloat(); // Scans the next token of the input as a float.
        System.out.print("Enter the second number: ");
        float secoundNum = numbers.nextFloat(); // Scans the next token of the input as a float.

        //Format your operator menu as shown in the example output.
        System.out.println("Tell me what operation you want to perform. Enter:");
        System.out.println("    a -   for addition");
        System.out.println("    s -   for subtraction");
        System.out.println("    m -   for multiplication");
        System.out.println("    d -   for division");
        System.out.print("What is your choice: ");

        //Scanner 2 to listen for character input from System.in
        Scanner characters = new Scanner(System.in);
        char choice = characters.next().trim().charAt(0);
        characters.close();
        numbers.close();

        //Brains of the program, computational math loops initiated depending on character input from user.
        float answer = 0;
        if (choice == 'a') {
            answer = firstNum + secoundNum;
        } else if (choice == 's') {
            answer = firstNum - secoundNum;
        } else if (choice == 'm') {
            answer = firstNum * secoundNum;
        } else if (choice == 'd') {
            answer = firstNum / secoundNum;
        }

        //Formatting and displaying results to the user
        //In the output, display no answer with more than two decimal places.
        DecimalFormat twoDecimal = null;
        twoDecimal = new DecimalFormat("#.##");
        System.out.println("The answer is " + twoDecimal.format(answer));
        System.out.println("Thank you for using the BuzyBot calculator.  Goodbye.");
        System.exit(0);
    }
}