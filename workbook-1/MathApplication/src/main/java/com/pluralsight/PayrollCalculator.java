package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = scanner.next();
        System.out.println("How many hours have you worked? ");
        float hours = scanner.nextFloat();
        System.out.println("What is your hourly pay rate?");
        float payRate = scanner.nextFloat();
        float grossPay = payRate * hours;

        System.out.println("Hello, " + name + ", your gross pay is " + grossPay);



    }
    public static float payroll(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = scanner.next();
        System.out.println("How many hours have you worked? ");
        float hours = scanner.nextFloat();
        System.out.println("What is your hourly pay rate?");
        float payRate = scanner.nextFloat();
        float grossPay = payRate * hours;
        sout

        System.out.println("Hello, " + name + ", your gross pay is " + grossPay);
        return grossPay;
    }
}
