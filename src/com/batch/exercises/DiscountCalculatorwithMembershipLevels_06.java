package com.batch.exercises;
import java.util.Scanner;

public class DiscountCalculatorwithMembershipLevels_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scc = new Scanner(System.in);

        System.out.print("Enter category:- ");
        String category = scc.nextLine();

        System.out.print("Enter membership type:- ");
        String membership = scc.nextLine();

        System.out.print("Enter price: ");
        double price = scc.nextDouble();

        double baseDiscount = 0;
        double membershipDiscount = 0;

       
        switch (category) {
            case "Electronics":
                baseDiscount = 10;
                break;

            case "Clothing":
                baseDiscount = 20;
                break;

            case "Groceries":
                baseDiscount = 5;
                break;

            default:
                System.out.println("Invalid Category");
                return;
        }

        switch (membership) {
            case "Gold":
                membershipDiscount = 10;
                break;

            case "Silver":
                membershipDiscount = 5;
                break;

            case "None":
                membershipDiscount = 0;
                break;

            default:
                System.out.println("Invalid Membership Type");
                return;
        }

        double totalDiscount = baseDiscount + membershipDiscount;
        double discountAmount = (totalDiscount / 100) * price;
        double finalPrice = price - discountAmount;

      
        System.out.println("Base Discount= " + baseDiscount + "%");
        System.out.println("Membership Discount= " + membershipDiscount + "%");
        System.out.println("Final Price= " + finalPrice);
    }
}