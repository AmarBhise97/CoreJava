package basics;

public class cons_private {
	

	public static void main(String[]args) {
		second sed = second.abcd();
		second sed1 = second.abcd();
		second sed2= second.abcd();
		second sed3= second.abcd();
	}

}
class second{
	public static int count;
	private second() {
		
		count = count +1;
		System.out.println("hey i am amar......" +count);
	}
	public static  second abcd() {
		second se = new second();
		return se;
	}
}
