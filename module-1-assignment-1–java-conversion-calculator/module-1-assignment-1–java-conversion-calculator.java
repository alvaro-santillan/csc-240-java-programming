///////////////////////////////////////////////////////////////////////////////
//Module 1 Assignment 1 – Java Conversion Calculator
//Student: Alvaro Santillan
//Instructor: Dr. Linda Hamons
//CSC240 C00 Java Programming
//Semester: Summer 2018
//Date Created: 6-1-2018
//Last Modified: 6-2-2018
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Conversion Calculator.");
        System.out.println("This program converts feet to meters");

        Scanner reader = new Scanner(System.in);
        System.out.println("please input the number of feet to be converted");
        double feet = reader.nextInt();
        double meter = feet / 3.2808;
        System.out.println(meter);
        System.out.println("goodbye");

        reader.close();
        System.exit(0);
    }
}