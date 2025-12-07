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
		int set[]=new int[4];
		OneD_1.single(set);
		OneD_1.print(set);

	}
}
