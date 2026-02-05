package com.batch.exercises;

import java.util.Scanner;
public class TaxSlabCalculator_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income catagory (Low/Medium/High/Very High) : ");
		String income=sc.nextLine();
		
		switch(income)
		{
			case "Low":
				System.out.println("Income catagory: Tax Percentage: 0% (Tax-free)");
				break;
			case "Medium":
				System.out.println("Income catagory: Tax Percentage: 5% tax ");
				break;
			case "High":
				System.out.println("Income catagory: Tax Percentage: 20% tax");
				break;
			case "Very High":
				System.out.println("Income catagory: Tax Percentage: 30% tax");
				break;
		    default:
		    	System.out.println(" Invalid Input");
				
		}
		
	}

}


