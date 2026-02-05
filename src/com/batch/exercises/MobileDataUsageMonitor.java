package com.batch.exercises;

import java.util.Scanner;

public class MobileDataUsageMonitor {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Weekly Data limit");
        int weeklyLimit = sc.nextInt();

        double[] dailyUsage = new double[7];
        for (int i = 0; i < dailyUsage.length; i++) {
            dailyUsage[i] = sc.nextDouble();
        }

        double maxCount = dailyUsage[0];
        double totalUsage = dailyUsage[0]; 
        int maxDay = 1;

        for (int i = 1; i < dailyUsage.length; i++) { 
            totalUsage += dailyUsage[i];

            if (dailyUsage[i] > maxCount) {
                maxCount = dailyUsage[i];
                maxDay = i + 1;
            }
        }

        double extraCharges = 0.0;
        if (totalUsage > weeklyLimit) {
            extraCharges = (totalUsage - weeklyLimit) * 50;
        }

        System.out.println("Total Usage: " + totalUsage + " GB");
        System.out.println("Average Usage: " + (totalUsage / 7) + " GB/Day");
        System.out.println("Highest Usage Day: Day" + maxDay);
        System.out.println("Extra Charge: " + extraCharges);
    }

}
