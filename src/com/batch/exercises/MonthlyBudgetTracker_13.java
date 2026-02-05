package com.batch.exercises;

public class MonthlyBudgetTracker_13 {

	public static void main(String[] args) {
        
        int budget = 30000;

        
        String[] categories = {
            "Rent", "Food", "Travel", "Shopping", "Bills", "Other"
        };

       
        int[] expenses = {12000, 6000, 4000, 5000, 3000, 2000};

        int totalExpense = 0;
        int maxExpense = expenses[0];
        String maxCategory = categories[0];

        
        for (int i = 0; i < expenses.length; i++) {
            totalExpense += expenses[i];

            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
                maxCategory = categories[i];
            }
        }

        int remaining = budget - totalExpense;

        
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Remaining: " + remaining);

        if (remaining < 0) {
            System.out.println("Overspent by: " + (-remaining));
        }

        System.out.println("Max Expense Category: " + maxCategory);
    }


	}


