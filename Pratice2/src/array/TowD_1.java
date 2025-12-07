package array;

import java.util.Scanner;

public class TowD_1 {
	static Scanner sc = new Scanner(System.in);
	public static void add(int [][]set) {
		for(int i=0;i<set.length;i++) {
			for(int j=0;j<set[i].length;j++) {
				System.out.println("Enter num");
				set[i][j]=sc.nextInt();
				
				
			}
		}
		
		
	}
	public static void print(int[][]set) {
	for(int [] zz:set) {
		for(int yy :zz) {
		System.out.print(yy+" ");
	}
	System.out.println();
		
	}
		
	}



	public static void main(String[]args) {
	int set[][]= new int[2][2];
	   TowD_1.add(set);
	   TowD_1.print(set);
}
}