package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  principal amount
        System.out.print("Enter the principal amount of the loan: $");
        double principal = scanner.nextDouble();

        //  annual interest rate
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();

        //  loan length in years
        System.out.print("Enter the loan length in years: ");
        int years = scanner.nextInt();

        //  interest rate calculation
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        //  number of months
        int numberOfPayments = years * 12;

        // Monthly payment calculation using the formula for compound interest
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Total interest calculation
        double totalInterest = (monthlyPayment * numberOfPayments) - principal;

        // Display results
        System.out.printf("A $%.2f loan at %.3f%% interest for %d years would have a $%.2f monthly payment with a total interest of $%.2f%n",
                principal, annualInterestRate, years, monthlyPayment, totalInterest);

        scanner.close();
    }
}
