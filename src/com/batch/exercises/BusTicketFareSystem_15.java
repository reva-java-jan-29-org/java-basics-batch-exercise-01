
package com.batch.exercises;

import java.util.Scanner;

public class BusTicketFareSystem_15 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter route type (City / Intercity / Night): ");
        String routeType = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter base fare: ");
        double baseFare = sc.nextDouble();

        double fare = baseFare;

        switch (routeType.toLowerCase()) {
            case "city":
                fare = fare * 1.0;
                break;

            case "intercity":
                fare = fare * 1.5;
                break;

            case "night":
                fare = fare * 2.0;
                break;

            default:
                System.out.println("Invalid route type");
                return;
        }

     
        if (age < 12) {
            fare = fare * 0.5;      
        } else if (age >= 60) {
            fare = fare * 0.7;     
        } 

        
        System.out.println("Final Fare: " + fare);

        sc.close();
	}

}
