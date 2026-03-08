package InterviewQuestion;

public class PalindromNumber {
	public static void main(String[]args) {
		
		int num=414;
		int original=num;
		int rev=0;
		
		while(num>0) {
			int rem= num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
		}
		if(original==rev) {
			System.out.println("palindrom " );
		}
		else {
			System.out.println("Not Palindrom" );
		}
	}

}
