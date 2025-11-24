package SingleD;

import java.util.Arrays;
import java.util.Scanner;

public class First {
	public static void main(String[]args) {
		int arr[]= new int[] {12,12,13,14};
		System.out.println(arr.toString());
		double arr1[]=new double[] {12.1,13.2,14.3,15.4};
		System.out.println(arr1.toString());
		int arr2[]=new int[] {10,20,30,40,50};
		System.out.println(Arrays.toString(arr2));
	}
	static Scanner sc=new Scanner(System.in);
	public static void getRecord(int[] num1){
		for(int index=0;index<5;index++) {
		System.out.println("Enter the value");
		num1[index]=sc.nextInt();
		//System.out.println(num1[index]+" ");
		}
	}
	public static void displayRecord(int[] num1) {
		
	for(int index=0;index<5;index++)

	System.out.print(num1[index]+" ");
		}
		
	
	

}
