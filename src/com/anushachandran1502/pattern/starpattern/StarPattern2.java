package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern2 {
	public static void solution()
	{
		Scanner s22=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s22.nextInt();
		pattern2(n);
		//scan.close();
	}
	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1|| j==1 || j==n-i+1)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
