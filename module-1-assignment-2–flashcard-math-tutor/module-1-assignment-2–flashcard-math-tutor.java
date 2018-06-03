///////////////////////////////////////////////////////////////////////////////
//Module 1 Assignment 2 – Flashcard Math Tutor
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 6-1-2018
//Last Modified: 6-3-2018
///////////////////////////////////////////////////////////////////////////////

/*
In this assignment, students will write a program that will present an
addition problem to the user. The program will generate two random numbers
and present them to the user in the form of an addition problem.
The user will enter the answer to the problem. The program will then output
the correct answer. Finally, the program will tell the user “goodbye” and terminate.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The program starts by greeting the user.
        //The program outputs to the user the purpose of the program (flashcard math practice).
        System.out.println("Hello");
        System.out.println("This program generates two random numbers and presents them in the form of an addition problem.");
        System.out.println("You will enter the answer to the problem below and this program will then output the correct answer.");

        //The program will then generate two random integer numbers between 1 and 100.
        Random rand = new Random();
        int randNum1 = rand.nextInt(100) + 1;
        int randNum2 = rand.nextInt(100) + 1;
        //100 is the maximum and 1 is the minimum.

        //The program will present the user with an addition problem based on the two random numbers.
        //The program will accept the user’s answer on the same line as it presented the problem.
        Scanner reader = new Scanner(System.in);
        System.out.print("What is " + randNum1 + " + " + randNum2 + "? ");
        int userAnswer = reader.nextInt(); // Scans the next token of the input as an int.
        reader.close();

        //Calculate the correct answer
        int answer = randNum1 + randNum2;
        //The program will output the result to the screen.
        System.out.println("The correct answer is: " + answer + ", Your input was: " + userAnswer + ".");
        //Finally, the program will say goodbye to the user and terminate.
        System.out.println("Goodbye");
        System.exit(0);
    }
}