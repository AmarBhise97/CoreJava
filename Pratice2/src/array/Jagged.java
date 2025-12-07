package array;

import java.util.Scanner;

public class Jagged {
	static Scanner sc = new Scanner(System.in);
	
	public static void add(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				System.out.println("Enter num");
				arr[row][column]=sc.nextInt();
			}
		}
		
	}
	public static void print(int arr[][]) {
		for(int []row:arr) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
public static void main(String[]args) {
	int arr[][]=new int[4][];
	arr[0]=new int[3];
	arr[1]=new int[2];
	arr[2]=new int[4];
	arr[3]=new int[1];
	Jagged.add(arr);
	Jagged.print(arr);
}
}
