package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your middle name (or leave blank if none): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your suffix (or leave blank if none): ");
        String suffix = scanner.nextLine().trim();


        String fullName = generateFullName(firstName, lastName, middleName, suffix);

        System.out.println("Your full name is: " + fullName);
    }

    public static String generateFullName(String firstName, String lastName, String middleName, String suffix) {
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        return fullName;
    }
}