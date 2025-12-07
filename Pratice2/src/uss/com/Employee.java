package uss.com;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		if(num2==0) {
			ArithmeticException ex=new ArithmeticException("Not allowed(Divide by Zero)");
			throw ex;
		}
		int result=num1/num2;
		System.out.println("Result : "+result);
		
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		//ex.printStackTrace();
	}
		
	}
}
