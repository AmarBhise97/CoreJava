package array;

import java.util.Scanner;

public class OneD_1 {
	static Scanner sc = new Scanner(System.in);

	public static void single(int[] set) {
		for (int i = 0; i < set.length; i++) {
			System.out.println("Enter num");
			set[i] = sc.nextInt();
		}
	}

	public static void print(int[] set) {
		for (int i = 0; i < set.length; i++) {
			System.out.println(set[i]);
		}
	}

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<100;i++) {
			boolean flag =false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag =true;
					
				}
			
			}
			
			 if(!flag) {
					
				 System.out.println("prime :"+i);
			 }
			
				
			
		}
	}
}
