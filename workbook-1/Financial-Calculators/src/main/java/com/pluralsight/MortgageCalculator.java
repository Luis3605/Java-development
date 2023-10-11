package com.pluralsight;

 import java.util.Scanner;

    public class MortgageCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get input from the user
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (as a percentage): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the loan length in years: ");
            int loanLengthYears = scanner.nextInt();

            // Calculate monthly payment
            double monthlyInterestRate = annualInterestRate / 12 / 100;
            int numPayments = loanLengthYears * 12;
            double monthlyPayment = (principal * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -numPayments));

            // Calculate total interest paid
            double totalInterest = (monthlyPayment * numPayments) - principal;

            // Display the results
            System.out.printf("Expected Monthly Payment: $%.2f\n", monthlyPayment);
            System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
        }
    }

