package jagged;

import java.util.Arrays;
import java.util.Scanner;

public class First {
	public static void setRecord(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}

	public static void getRecord(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				/*if(row==2&&col==1) {
					continue;
				}*/
				System.out.println("Enter value");
				arr[row][col]=sc.nextInt();
			}
		}
		
	}
	public static void displayRecord(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
			if(row==3&&col==1) {
				System.out.print("  ");
				
				
			}
			else {
			System.out.print(arr[row][col]+" ");
		}}
			System.out.println();
	}}
	
	public static void main(String[]args) {
		int arr[][]=new int[4][];
		 arr[0]=new int[0];
		 arr[1]=new int[2];
		 arr[2]=new int[4];
		 arr[3]=new int[3];
		
		/* for(int row=0;row<arr.length;row++) {
			 for(int col=0;col<arr[row].length;col++) {
				 System.out.print(arr[row][col]+" ");
			 }
			 System.out.println();
			 
		 }
			 
		 for(int []i:arr) {
			 for(int element:i) {
				 System.out.print(element+" ");
			 }
			 System.out.println();
		 }
	*/   
		getRecord(arr);
		displayRecord(arr);
	    setRecord(arr);

}
}
