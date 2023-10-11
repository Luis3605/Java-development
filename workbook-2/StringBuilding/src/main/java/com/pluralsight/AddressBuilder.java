package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  billing address
        System.out.println("Enter your billing address:");
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append("Billing Address:\n");
        appendAddressInfo(billingAddress, scanner);

        // shipping address
        System.out.println("\nEnter your shipping address:");
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append("Shipping Address:\n");
        appendAddressInfo(shippingAddress, scanner);

        // Print addresses
        System.out.println("\nBilling Address:");
        System.out.println(billingAddress.toString());

        System.out.println("\nShipping Address:");
        System.out.println(shippingAddress.toString());

        scanner.close();
    }

    private static void appendAddressInfo(StringBuilder address, Scanner scanner) {
        System.out.print("Street Address: ");
        address.append("Street Address: ").append(scanner.nextLine()).append("\n");

        System.out.print("City: ");
        address.append("City: ").append(scanner.nextLine()).append("\n");

        System.out.print("State: ");
        address.append("State: ").append(scanner.nextLine()).append("\n");

        System.out.print("Postal Code: ");
        address.append("Postal Code: ").append(scanner.nextLine()).append("\n");

        System.out.print("Country: ");
        address.append("Country: ").append(scanner.nextLine()).append("\n");
    }}
