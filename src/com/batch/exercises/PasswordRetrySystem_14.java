package com.batch.exercises;
import java.util.Scanner;

public class PasswordRetrySystem_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Set your Password");
		String password = sc.next();
		
		System.out.println("Enter Password (Warning : Only 3 Attempts)");
		int count = 1;
		do {
			String enterpassword = sc.next();
			
			if(password.equals(enterpassword)) {
				System.out.println("Access Granted");
				break;
				
			}else {
				System.out.println("Attempt Count " + count +" : Wrong");
			}
			count++;
		}while(count<=3);
		
		if(count>3) {
			System.out.println("Account Locked");
		}

	}

}