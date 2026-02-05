package com.batch.exercises;

public class Inventory_reorder_alert_16 {
    public static void main(String[] args) {
        
        int[] stock = {10, 4, 15, 20, 7, 1, 12, 3};
       
        int threshold = 5; 

        System.out.println("--- Inventory Reorder Report ---");

       
        int reorderCount = 0;
        
       
        StringBuilder reorderList = new StringBuilder();

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= threshold) {
                reorderCount++;
                
                reorderList.append("Product ")
                           .append(i + 1)
                           .append(": stock=")
                           .append(stock[i])
                           .append("\n");
            }
        }

      
        if (reorderCount == 0) {
            System.out.println("all good");
        } else {
            System.out.println("items to reorder: " + reorderCount);
            System.out.print(reorderList.toString());
        }
    }
}
