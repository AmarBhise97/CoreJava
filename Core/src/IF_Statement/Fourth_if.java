package IF_Statement;

import java.util.Scanner;

public class Fourth_if {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		if (a>b)
		 System.out.println("True");
		else if (b<a)
			System.out.println("False");
		 else
			 System.out.println("False");
		sc.close();
		}


}
