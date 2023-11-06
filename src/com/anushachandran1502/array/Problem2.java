package com.anushachandran1502.array;

import java.util.*;
public class Problem2 {
	public static void solution()
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a Array length");
	int arrLength=s1.nextInt();
	int[] array=new int[arrLength];
	for(int i=0;i<arrLength;i++)
	{
		System.out.println("Index Of "+i);
		array[i]=s1.nextInt();
	}
	s1.close();
	System.out.println("Input: "+Arrays.toString(array));
System.out.println(Arrays.toString(rearrangeArray(array,arrLength)));
}
public static int[] rearrangeArray(int[] array,int arrLength)
{	Arrays.sort(array);
	int[] result=new int[arrLength];
	int even=(arrLength%2==0)?(arrLength/2)-1:(arrLength/2);
	int odd=even+1 ;
	for(int i=0;i<arrLength;i++)
	{
		if(i%2==0)
			result[i]=array[even--];
		else
			result[i]=array[odd++];
	}
	return result;
}

}
