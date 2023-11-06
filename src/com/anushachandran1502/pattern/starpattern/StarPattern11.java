package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern11 {
	public static void solution()
	{
		Scanner s11=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s11.nextInt();
		pattern11(n);
		//scan.close();
	}
	static void pattern11(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
