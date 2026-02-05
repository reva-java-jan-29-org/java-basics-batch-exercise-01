package com.batch.exercises;
import java.util.Scanner;
public class StudentResultCard11 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

        int subjects=5;
        int maxsubjectsMarks=100;

        int[] marks=new int[subjects];
        int total=0;
        boolean allPassed=true;

        for (int i=0; i<subjects;i++){
            System.out.println("Enter marks: "+(i+1));
            marks[i]=sc.nextInt();

            total+=marks[i];

            if(marks[i]<35) allPassed=false;
        }

        int maxMarks=subjects*maxsubjectsMarks;
        double percentage=(total/(double)maxMarks)*100;

        String grade;
        if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

         for (int i = 0; i < subjects; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + (allPassed ? "PASS" : "FAIL"));
        System.out.println("Grade: " + grade);

        sc.close();
	}

}
