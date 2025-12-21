package core;

import java.util.Scanner;

public class Switch_1 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Day:");
	int x = sc.nextInt();
	switch(x) {
	case 1:
		System.out.println("Monday:"+x);
		break;
	case 2:
		System.out.println("Tuesday:"+x);
		break;
	case 3:
        System.out.println("Wednesday:"+x);
        break;
	case 4:
        System.out.println("Thursday:"+x);
        break;
	case 5:
        System.out.println("Friday:"+x);
        break;
	case 6:
        System.out.println("Saturday:"+x);
        break;
	case 7:
        System.out.println("Sunday:"+x); 
        break;
    default:
    	System.out.println("Enter the valid number");
    	
       sc.close(); 
	}
}

}
