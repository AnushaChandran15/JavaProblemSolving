package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern10 {
	public static void solution()
	{
		Scanner s10=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s10.nextInt();
		pattern10(n);
		//scan.close();
	}
	static void pattern10(int n)
	{ 
		
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print("*");
			for(int k=0;k<i*2;k++)
				System.out.print(" ");
			for(int l=n-1;l>=i;l--)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			for(int k=2*n-2;k>i*2;k--)
				System.out.print(" ");
			for(int l=0;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
			
	}

}
