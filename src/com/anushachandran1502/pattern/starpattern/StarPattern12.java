package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern12 {
	public static void solution()
	{
		Scanner s12=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s12.nextInt();
		pattern12(n);
		//scan.close();
	}
	static void pattern12(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==n-1 || i==n-1 || j==0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
	

}
