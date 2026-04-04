package InterviewQuestion;

public class ReverseNumber {
	public static void main1(String[]args) {
		
		int num=1234;
		int rev=0;
		
		while(num!=0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[]args) {
		
		
	}

}
