package InterviewQuestion;

import java.util.Scanner;

public class Table {
	public static void main2(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
		}
	}
	
	
	
	public static void main1(String[]args) {
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
		}
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
		}
	}

}
