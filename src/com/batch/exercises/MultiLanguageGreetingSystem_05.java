package com.batch.exercises;

import java.util.Scanner;

public class MultiLanguageGreetingSystem_05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Language: ");
		String language=scan.next();
		switch(language) {
		case "English":{
			System.out.println("Enter time of day: ");
			String time=scan.next();
			switch(time) {
			case "Morning": System.out.println("Greeting: Good Morning");
			break;
			case "Afternoon": System.out.println("Greeting: Good Afternoon");
            break;
			case "Evening": System.out.println("Greeting: Good Evening");
            break;
			case "Night": System.out.println("Greeting: Good Night");
            break;
			             
			}
		}
		break;
		case "Spanish":{
			System.out.println("Enter time of day: ");
			String time=scan.next();
			switch(time) {
			case "Morning": System.out.println("Greeting: Buenos dias");
			break;
			case "Afternoon": System.out.println("Greeting: Buenas tardes");
            break;
			case "Evening": System.out.println("Greeting: Buenas noches");
            break;
			case "Night": System.out.println("Greeting: Buenas noches");
            break;
			             
			}
		}
		
		}

	}

}
