package com.batch.exercises;

import java.util.Scanner;

public class AccessControlSystem04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role(s) (comma-separated): ");
        String input = sc.nextLine();

        // Split roles by comma
        String[] roles = input.split(",");

        boolean read = false;
        boolean write = false;
        boolean execute = false;

        // Loop through each role
        for (String role : roles) {
            role = role.trim().toLowerCase();

            switch (role) {
                case "admin":
                    read = true;
                    write = true;
                    execute = true;
                    break;

                case "manager":
                    read = true;
                    write = true;
                    break;

                case "employee":
                    read = true;
                    break;

                case "guest":
                    read = true;
                    break;

                default:
                    System.out.println("Invalid role: " + role);
            }
        }

        // Display combined access rights
        System.out.println("\nAccess Rights:");
        if (read) System.out.println("- Read");
        if (write) System.out.println("- Write");
        if (execute) System.out.println("- Execute");

        if (!read && !write && !execute) {
            System.out.println("No access granted.");
        }

        sc.close();
    }
}
