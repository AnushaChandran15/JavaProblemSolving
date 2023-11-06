package com.anushachandran1502.pattern.numberpattern;

import java.util.Scanner;

public class NumberPattern2 {
	public static void solution()
	{
		Scanner s7=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s7.nextInt();
		pyramid2(n);
		//scan.close();
	}
	static void pyramid2(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print((n-i+1)+" ");
			}
			System.out.println();
		}
	}

}
