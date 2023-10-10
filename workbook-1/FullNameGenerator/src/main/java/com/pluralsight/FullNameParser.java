package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name (either first last or first middle last): ");
        String inputName = scanner.nextLine().trim();


        String[] nameParts = inputName.split("\\s+");

        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Invalid input. Please enter a valid name (either first last or first middle last).");
        }
    }
}