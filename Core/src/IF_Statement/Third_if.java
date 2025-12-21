package IF_Statement;

import java.util.Scanner;

public class Third_if {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if (a % 2 == 0)
			System.out.println(" That is Even number ");
		else
			System.out.println(" That is Odd number ");
		sc.close();
	}

}
