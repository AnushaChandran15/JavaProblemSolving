package com.anushachandran1502.pattern.numberpattern;

import java.util.Scanner;

public class NumberPattern4 {
	public static void solution()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s.nextInt();
		pyramid5(n);
		//scan.close();
	}
	static void pyramid5(int n)
	{
		int l=1;
		
		for(int i=1;i<=n;i++)
		{
			l=1;
			for(int j=1;j<=n;j++)
			{
				if(j<=n-i)
					System.out.print(" ");
				else
					System.out.print(l++);
			}
			for(int k=i-1;k>=1&&i>=2;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}



}
