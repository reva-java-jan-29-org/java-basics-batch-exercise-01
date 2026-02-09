package com.batch.exercises;

import java.util.Scanner;

public class SavingsCalculator_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter savings goal");
		double goal=sc.nextDouble();
		System.out.println("enter initial balance");
		double balance=sc.nextDouble();
		System.out.println("enter monthly deposit");
		double deposit=sc.nextDouble();
		System.out.println("enter interest rate");
		double interest=sc.nextDouble();
		
		double monthlyrate = interest/12.0/100.0;
		long month=0;
		
		if(deposit==0 && monthlyrate==0) {
			System.out.println("Goal cannot be reached in a realistic timeframe.");
			return;
		}
		
		while(balance<goal) {
			month++;
			balance+=deposit;
			balance*=(1.0+monthlyrate);
			
			System.out.printf("Month %d: Total savings = %.2f%n", month, balance);

			if(month>1000000) {
				System.out.println("goal cant be reached in a realistic timeframe");
				return;
			}
		}
		System.out.println("Goal achieved in " + month + " months.");
		
		sc.close();
}
}
