package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sandwich size (1 for regular,  2 for large)")
        double age = scanner.nextDouble();

        double regularPrice = 5.45;
        double largePrice = 8.95;

        double totalPrice;
        if (age < 18) {
           regularPrice = 5.45 * .9;
           largePrice = 8.95 * .8;
        } e
        }

    }




}
