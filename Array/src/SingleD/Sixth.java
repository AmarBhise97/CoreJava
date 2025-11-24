package SingleD;

import java.util.Scanner;

public class Sixth {
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System .out.println("Enter size:");
		int size=sc.nextInt();
		int number[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter variable:");
			number[i]=sc.nextInt();
			
			
		}
		int x=sc.nextInt();
		
		for(int i=0;i<number.length;i++) {
			if (number[i]==x) {
				System.out.println("z found at index:"+" "+ +i);
			}
			//System.out.println("values is:"+i);
		}
		
			
	}
}
