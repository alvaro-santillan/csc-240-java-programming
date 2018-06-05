import java.util.Scanner;
//import java.lang.Math.*;

public class Main {

    //The main method that outputs an introduction to the program.
    public static void main(String[] args) {
        System.out.println("Welcome to the Round Object Calculator");
        System.out.println("This program will calculate the area of a circle");
        System.out.println("        or the volume of a sphere.");
        System.out.println("The calculations will be based on the user input radius.");

        UserInput();
    }

    public static void UserInput() {
        Scanner character = new Scanner(System.in);
        System.out.print("Enter C for circle or S for sphere: ");
        char choice = character.next().trim().charAt(0);

        Scanner circleNum = new Scanner(System.in);
        System.out.print("Thank you. What is the radius of the circle (in inches): ");
        float circleRadius = circleNum.nextFloat();

        Scanner sphereNum = new Scanner(System.in);
        System.out.print("Thank you. What is the radius of the sphere (in inches): ");
        float sphereRadius = sphereNum.nextFloat();

        Scanner recalculate = new Scanner(System.in);
        System.out.print("Do you want to calculate another round object (Y/N)? ");
        char redo = recalculate.next().trim().charAt(0);
    }

//    public static void CircleCalculator() {
//
//    }
//
//    public static void SphereCalculator() {
//
//    }
//
//    public static void Output() {
//
//    }
//
//    public static void Terminate() {
//
//    }
}

//    char redue = "y";
//        do {

//
//
//        Scanner number = null;
//        if (choice == 'C' || 'c') {
//
//            float answer = (Math.PI * Math.pow(CircleRadius, 2));
//            if(answer == '0'){
//                return 0;
//            }
//        } else if (choice == 'S' || 's') {
//            float answer = ((4/3) * Math.PI * Math.pow(sphereRadius, 3));
//            if(answer == '0'){
//                return 0;
//            }
//        }
//

//
//
//
//    } while (redue == 'Y' || 'y')
//
//            System.out.println("Thank you for using the Round Object Calculator.  Goodbye.");
//
////        character.close();
////        number.close();
////        System.exit(0);
//}

//        The volume of a sphere with a radius of 45.9 inches is: 405066.816 cubic inches.

//        The area of a circle with a radius of 15.86 inches is: 790.235 inches.