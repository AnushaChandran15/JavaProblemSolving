package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern1 {
	public static void solution()
	{
		Scanner s9=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s9.nextInt();
		pattern1(n);
		//scan.close();
	}
	static void pattern1(int n)
	{
			for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1 || i==j || j==n)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	

}
