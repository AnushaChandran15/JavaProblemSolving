package com.anushachandran1502.pattern.numberpattern;

import java.util.Scanner;

public class NumberPattern3 {
	public static void solution()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=scan.nextInt();
		pyramid4(n);
		//scan.close();
	}
	static void pyramid4(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=n-i)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			for(int k=n-1;k>=n-i+1&&i>=2;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
