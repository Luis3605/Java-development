package com.pluralsight;

import java.util.Scanner;

public class myApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String name = getName(scanner);
     int age = getAge(scanner);

        printMessage(name, age);

        printVotingEligibility(age);

        printWelcomeMessage(name);

        printDrinkEligibility(name, age);

        double number = getNumber(scanner);

        double squareRoot = calculateSquareRoot(number);
        System.out.println("the square root of " + number + " is " + squareRoot);

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);

        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater then " + secondNumber +" : " + isGreaterThan );

        String welcomeMessage = name.equals("Eve") ? "You are not welcome!" : "You are welcome!";
        System.out.println(welcomeMessage);

        double num1 = 5.6;
        double num2 = 3.2;
        double maxNum = getMax(num1,num2);

    }

    public static double getMax(double num1, double num2){
        return Math.max(num1,num2);

    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;

    }
    public static void printWelcomeMessage(String name){
        switch (name.toLowerCase()){
            case "alice":
                System.out.println("Welcome, Alice");
                break;
            case "bob":
                System.out.println("Hey bob, do you want to get a drink?");
                break;
            default:
                    System.out.println("Hello, stranger!");
                    break;
        }
    }
public static double calculateSquareRoot(double number){
        double root = Math.sqrt(number);
        return root;
}
    public static void printDrinkEligibility(String name, int age){
      if (name.equalsIgnoreCase("Bob") && age > 21 ){
            System.out.println("You are old enough to drink. ");

      } else {
          System.out.println("You are not old enough to drink.");
      }
    }

    public static void printMessage(String name, int age){
        System.out.println("Hello, " + name + " you are " + age + " years old.");
    }
    public static String getName(Scanner scanner){
        System.out.println("Enter your name: ");
       return scanner.nextLine();

    }
    public static int getAge(Scanner scanner){
        System.out.println("Enter your age: ");
        return scanner.nextInt();

    }
    public static void printVotingEligibility(int age){
        if(age >= 18){
            System.out.println("You are old enough to vote!");
        } else{
            System.out.println("You are not old enough to vote.");}

    }
    public static double getNumber(Scanner scanner){
        System.out.println("Enter your number");
        return scanner.nextDouble();
    }
    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter your first number");
        return scanner.nextInt();
    }
    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter your second number");
        return scanner.nextInt();
    }
}

