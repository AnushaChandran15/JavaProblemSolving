package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern8 {
	public static void solution()
	{
		Scanner s88=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s88.nextInt();
		pattern8(n);
		//scan.close();
	}
	static void pattern8(int n)
	{
		
		for(int i=1;i<=(n*2)-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n || i+j==n+1 || i-j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
