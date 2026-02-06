package com.batch.exercises;

import java.util.Scanner;

public class OrderProcessShippingCharges_12 {
	
	static void calculateShipCharges(String category,float weight) {
		if (weight <= 0) {
            System.out.println("Invalid weight. Weight must be greater than 0.");
            return;
        }
		int baseRatePerKg;
		
		switch(category) {
		case "Standard":
			baseRatePerKg = 20;
			break;
		case "Express":
			baseRatePerKg = 40;
			break;
		case "SameDay":
			baseRatePerKg = 60;
			break;
		default:
			System.out.println("Category is invalid!!!");
			return;
		}
		
		float cost = baseRatePerKg * weight;
		
		if(weight > 10) {
			cost += 50;
		}
		
		System.out.println("Category: " + category);
        System.out.println("Weight: " + weight);
        System.out.println("Shipping Cost: " + cost);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Category From (Standard | Express | SameDay ): ");
		String category = sc.next();
		System.out.print("Enter weight of your package: ");
		float weight = sc.nextFloat();
		calculateShipCharges(category,weight);
		sc.close();
		
	}

}
