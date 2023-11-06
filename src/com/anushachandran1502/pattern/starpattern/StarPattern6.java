package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern6 {
	public static void solution()
	{
		Scanner s66=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s66.nextInt();
		pattern6(n);
		//scan.close();
	}
	static void pattern6(int n)
	{
			for(int i=0;i<n;i++)
	{
		for(int k=0;k<n-i-1;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)
		{
			if(i==0  || i==n-1 || j==n-1 || j==0)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");
		
	}
	}

}
