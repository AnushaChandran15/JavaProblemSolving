package com.anushachandran1502;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.Exception;
import java.lang.reflect.Method;
import java.nio.file.Files;

public class Home {
	private static Map<Integer,String> getList(String path){
		Map<Integer,String> fileList=new HashMap<>();
		//System.out.println(path);
		File packagePath=new File(path);
		int n=0;
		for(String fileName:packagePath.list()) {
			if(!fileName.startsWith("Home")) {
				System.out.println(++n+" . "+fileName);
				fileList.put(n, fileName);
			}
		}
		return fileList;
	}
	private static void callMethod(String path) throws Exception {
        String methodName = "solution";
        Class<?> clazz = Class.forName(path);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        java.lang.reflect.Method method = clazz.getMethod(methodName);
        method.invoke(instance);
	}
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		Stack<String> location=new Stack<>();
		Stack<String> currentPackage=new Stack<>();
		location.push("C:\\Anusha\\JavaProblemSolving\\src\\com\\anushachandran1502");
		currentPackage.push("com.anushachandran1502");
		String file=null;
		do {
			Map<Integer,String> files=getList(location.peek());
			System.out.println("press 0 to go back");
			System.out.println("press -1 to Exit");
			System.out.println("Enter your choice");
			int n=scan.nextInt();
			scan.nextLine();
			if(n==0) {
				if(location.size()>1) {
					//System.out.println("k");
					location.pop();
					currentPackage.pop();
				}
				continue;
			}
			if(n==-1) {
				System.out.println("\t\t\t----------------------"+"Thank You"+"---------------------");
				break;
			}
			if(n>files.size()) {
				System.out.println("Enter valid input/n");
				continue;
			}
			file=files.get(n);
			location.push(location.peek()+"\\"+file);
			currentPackage.push(currentPackage.peek()+"."+file);
			if(currentPackage.peek().endsWith("java")) {
				String path=currentPackage.peek().substring(0,currentPackage.peek().length()-5);
				System.out.println(path);
				callMethod(path);
				location.pop();
				currentPackage.pop();
				System.out.println("Press Enter to get back");
				scan.nextLine();
			}
		}	
		while(true);
		scan.close();
	}
		
}
