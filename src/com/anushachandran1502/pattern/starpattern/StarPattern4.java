package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern4 {
	public static void solution()
	{
		Scanner s44=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s44.nextInt();
		pattern4(n);
		//scan.close();
	}
	static void pattern4(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2)-1;j++)
			{
			if(i==n|| j==n+i-1 || i+j==n+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
