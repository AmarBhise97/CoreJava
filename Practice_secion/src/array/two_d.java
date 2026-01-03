package array;

import java.util.Scanner;

public class two_d {
	public static void main1(String[]args) {
		int arr[][]= new int [2][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
	
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		
		
		
		
		for(int row =0; row <arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
			System.out.print(arr[row][col]+" ");
			
		}
			System.out.println();
	}

}
	
	public static void main(String[]args) {
		int arr[][]=new int [3][3];
		 Scanner sd= new Scanner(System.in);
		 
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter num");
				arr[i][j]=sd.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}