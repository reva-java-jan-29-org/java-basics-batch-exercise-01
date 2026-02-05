package com.batch.exercises;
import java.util.Scanner;

public class ExamSlotBooking_17 {
	
	

	

	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] seats = {5, 5, 5}; // Morning, Afternoon, Evening

	        while (true) {
	            System.out.println("\nChoose Exam Slot:");
	            System.out.println("1. Morning");
	            System.out.println("2. Afternoon");
	            System.out.println("3. Evening");
	            System.out.println("0. Exit");

	            int choice = sc.nextInt();
	            int index = -1;
	            String slotName = "";

	            switch (choice) {
	                case 1:
	                    index = 0;
	                    slotName = "Morning";
	                    break;

	                case 2:
	                    index = 1;
	                    slotName = "Afternoon";
	                    break;

	                case 3:
	                    index = 2;
	                    slotName = "Evening";
	                    break;

	                case 0:
	                    System.out.println("Exiting booking system.");
	                    return;

	                default:
	                    System.out.println("Invalid choice.");
	                    continue;
	            }

	            if (seats[index] > 0) {
	                seats[index]--;
	                System.out.println("Booked " + slotName +
	                        ". Remaining seats: " + seats[index]);
	            } else {
	                System.out.println(slotName + " slot is full.");
	            }
	        }
	    }
	}



