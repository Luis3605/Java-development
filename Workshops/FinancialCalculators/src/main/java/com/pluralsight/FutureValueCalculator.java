package com.pluralsight;


import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: $");
        double deposit = scanner.nextDouble();

        // annual interest rate
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // interest rate calculation
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // number of months
        int numberOfMonths = years * 12;

        // Future value calculation using the formula for compound interest
        double futureValue = deposit * Math.pow(1 + monthlyInterestRate, numberOfMonths);

        // Total interest earned calculation
        double totalInterest = futureValue - deposit;

        // Display results
        System.out.printf("If you deposit $%.2f in a CD that earns %.2f%% interest and matures in %d years,%n",
                deposit, annualInterestRate, years);
        System.out.printf("your CD's ending balance will be $%.2f and you would have earned $%.2f in interest%n",
                futureValue, totalInterest);

        scanner.close();
    }
}
