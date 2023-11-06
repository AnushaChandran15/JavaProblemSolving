package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern5 {
	public static void solution()
	{
		Scanner s55=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s55.nextInt();
		pattern5(n);
		//scan.close();
	}
	static void pattern5(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0  || i==n-1 || j==n-1 || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
	}


}
