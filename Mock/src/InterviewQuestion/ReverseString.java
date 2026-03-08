package InterviewQuestion;

public class ReverseString {
	public static void main(String[]args) {
		String str="AMAR";
		String rev="";
		int num=1234;
		int r;
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
