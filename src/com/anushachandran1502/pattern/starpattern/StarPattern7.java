package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern7 {
	public static void solution()
	{
		Scanner s77=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s77.nextInt();
		pattern7(n);
		//scan.close();
	}
	static void pattern7(int n)
	{
		for(int i=1;i<=(n*2)-1;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==j || i+j==n*2)
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
