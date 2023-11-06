package com.anushachandran1502.pattern.numberpattern;

import java.util.Scanner;

public class NumberPattern1 {
	public static void solution()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=sc.nextInt();
		pyramid1(n);
		//sc.close();
	}
	static void pyramid1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
