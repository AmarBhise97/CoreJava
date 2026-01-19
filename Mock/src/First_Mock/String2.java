package First_Mock;

public class String2 {
	public static void main(String[]args) {
		String str=null;
		String str1="null";
		String str2="Amar";
		//System.out.println(str.concat(str1)); --> nullPointerException
		//System.out.println(str1.concat(str)); --> throws NullPointer Exception
		System.out.println(str1.concat(str2));
		
	}

}
