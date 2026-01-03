package array;

import java.util.Scanner;

public class OneD_2 {
	public static void main(String[]args) {
		int arr[]= new int [2];
	   for (int i=0;i<arr.length;i++) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number : ");
		   arr[i] = sc.nextInt();
		   
	   }
	   for (int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	}

}
