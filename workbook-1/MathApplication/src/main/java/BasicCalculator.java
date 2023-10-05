package com.pluralsight;

import java.util.Scanner;
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter in the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // enter in the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask for the operation
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = scanner.nextInt();

        double result;

        // Perform the selected operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }






        }
    }}
