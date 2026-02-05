package com.batch.exercises;

import java.util.Scanner;

public class CinemaTicketBookingWithSeatAvailability {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // 0 = available, 1 = booked
	        int[] seats = {0, 0, 1, 0, 0, 1, 0, 0, 0, 0};

	        int ticketPrice = 0;
	        int totalTickets = 0;
	        int totalCost = 0;

	        System.out.print("Enter ticket type (Regular/Premium): ");
	        String type = sc.next();

	        // switch for ticket pricing
	        switch (type) {
	            case "Regular":
	                ticketPrice = 200;
	                break;
	            case "Premium":
	                ticketPrice = 300;
	                break;
	            default:
	                System.out.println("Invalid ticket type");
	                return;
	        }

	        
	        while (true) {

	            System.out.print("Enter seat number (1-10, 0 to stop): ");
	            int seat = sc.nextInt();

	            if (seat == 0) {
	                break;
	            }

	            int index = seat - 1;

	            if (seats[index] == 1) {
	                System.out.println("Seat " + seat + " is already booked. Choose another.");
	            } else {
	                seats[index] = 1;
	                totalTickets++;
	                totalCost += ticketPrice;
	                System.out.println("Seat " + seat + " booked successfully.");
	            }
	        }

	        System.out.println("Total tickets: " + totalTickets);
	        System.out.println("Total cost: " + totalCost);
	    }

}
