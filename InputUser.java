package com.edu.akshata;


import java.util.Scanner;

//import java.lang.*;

public class InputUser {

	public static void main(String[] args) {
		int age ;
		float salary ;
		String name;
		char gen;
		// input data for user 
		
		//step 1:
		//create an object of scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age");
		age = sc.nextInt();
		//nextByte() , nextShort() , nextDouble()
		
		System.out.println("Enetr Salary");
		salary = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enetr Name");
		//name = sc.next(); //single word
		 name=sc.nextLine();//with the space
		
		System.out.println("Enetr gender");
		gen = sc.next().charAt(0); // read a char
		
		System.out.println("User Details");
		System.out.println("Name="+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
		System.out.println("Gender = "+gen);
		
		
		

	}

}
