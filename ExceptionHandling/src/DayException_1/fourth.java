package DayException_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fourth {
public static void main(String[]args) {
	int str;
	Scanner sc = new Scanner(System.in);
	try {
	str=sc.nextInt();
	System.out.println(str);
	}
	catch(InputMismatchException ex) {
		System.out.println(ex);
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		
	}
}
}
