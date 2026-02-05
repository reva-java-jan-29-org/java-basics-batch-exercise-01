package com.batch.exercises;

import java.util.Scanner;

public class VoteCounterSystem_18 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Votes: ");
		int n = sc.nextInt();
		int count[] = new int[4];
		int invalid = 0;
		
		System.out.println("Enter vote (1 to 4): ");
		for(int i=0; i<n; i++)
		{
			int vote = sc.nextInt();
			if(vote>=1 && vote<=4)
			{
				count[vote-1]++;
			}
			else
			{
				invalid++;
			}
		}
		
		System.out.println("Candidate 1: " + count[0]);
		System.out.println("Candidate 2: " + count[1]);
		System.out.println("Candidate 3: " + count[2]);
		System.out.println("Candidate 4: " + count[3]);
		System.out.println("Invalid: " + invalid);
		
		int max = count[0];
		for(int i=0; i<4; i++)
		{
			if(count[i]>max)
			{
				max=count[i];
			}
		}
		
		int winner = 0;
		for(int i=0; i<4; i++)
		{
			if(count[i] == max)
			{
				winner++;
			}
		}
		
		if(winner == 1)
		{
			for(int i=0; i<4; i++)
			{
				if(count[i]==max)
				{
					System.out.println("Result: Winner is Candidate " + (i+1));
				}
			}
		}
		
		else
		{
			System.out.print("Result: Tie between ");
			boolean first = true;
			for(int i=0; i<4; i++)
			{
				if(count[i]==max)
				{
					if(!first)
					{
						System.out.print("and ");
					}
					System.out.print("Candidate " + (i+1) + " ");
					first=false;
				}
			}
		}
		sc.close();
	}
}
