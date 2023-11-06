package com.anushachandran1502.pattern.numberpattern;

import java.util.Scanner;

public class NumberPattern5 {
	public static void solution()
	{
		Scanner s8=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s8.nextInt();
		pyramid7(n);
		//scan.close();
	}
	static void pyramid7(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}


}
