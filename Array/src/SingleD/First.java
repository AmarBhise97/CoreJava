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
		
	
	public static void main6(String[]args) {
		
		//int num1[]=new int[5] ;
		int num1[]=new int[] {11,22,33,44,55};
		//getRecord(num1);
		//displayRecord(num1);
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		System.out.println(num1[3]);
		System.out.println(num1[4]);
		//System.out.println(num1[5]);
		
	}	
		
	public static void main5(String[]args) {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int index=0;index<5;index++) {
			System.out.print(arr[index]+" ");
		}
	}
	
	public static void main4(String[]args) {
		if(System.out.printf("Amar")!=null) {////////////Without samicolan//////////////
			
		}
	}
	public static void main3(String[]args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the size");
		int size = sc.nextInt();
		//int arr1[]=new int[size];
	}
	public static void main2(String[]args) {
		int arr[]=new int[] {1,2,3};
		for(int index=0;index<3;index++) 
			System.out.print(arr[index]+"  ");
	}
	public static void main1(String[]args) {
		int arr[]=new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
	}	
	

}
