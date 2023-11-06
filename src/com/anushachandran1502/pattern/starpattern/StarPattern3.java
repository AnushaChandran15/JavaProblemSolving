package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern3 {
	public static void solution()
	{
		Scanner s33=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s33.nextInt();
		pattern3(n);
		//scan.close();
	}
	static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
			if(i==1 || i==j || i+j==n*2)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
