package InterviewQuestion;

public class CheckVovels {
	
	public static void main(String[]args) {
		
		String str="Java Programing";
		
	
		
		int counter=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				counter++;
				System.out.println(ch);
				
			}
			
		}
		System.out.println(counter );
		
	}

}
