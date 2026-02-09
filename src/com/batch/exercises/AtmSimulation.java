package com.batch.exercises;

import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your starting balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter your daily withdrawal limit: ");
        double dailyLimit = sc.nextDouble();

        double withdrawToday = 0;
        int choice;

        do {
            System.out.println("\nWelcome to ATM");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount you want to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } 
                    else if (withdrawAmount > balance) {
                        System.out.println("You do not have enough balance.");
                    } 
                    else if (withdrawToday + withdrawAmount > dailyLimit) {
                        System.out.println("You have reached your daily withdrawal limit.");
                    } 
                    else {
                        balance -= withdrawAmount;
                        withdrawToday += withdrawAmount;
                        System.out.println("Withdrawal completed. Remaining balance: " + balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount you want to deposit: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } 
                    else {
                        balance += depositAmount;
                        System.out.println("Deposit completed. Current balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 0:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}

