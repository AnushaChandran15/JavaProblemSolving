package com.anushachandran1502.pattern.starpattern;

import java.util.Scanner;

public class StarPattern9 {
	public static void solution()
	{
		Scanner s99=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=s99.nextInt();
		pattern9(n);
		//scan.close();
	}
	
	static void pattern9(int n)
	{
		
	 int i, j; 
        
        for (i = 1; i <= n; i++) { 
            
            for (j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
           
            for (j = 1; j <= 2 * i - 1; j++) { 
                if (j == 1 || j == 2*i-1) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
	}
}
