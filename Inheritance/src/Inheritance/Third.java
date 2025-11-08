package Inheritance;

public class Third {
public static void main(String[]args) {
	//DCE
	Mustang m1 = new Mustang(new int[] {10},new int [10][20] );
	System.out.println();
	Mustang m2=new Mustang(new int[] {20},Mustang.arr2);
}
}

class Mustang{
	public Mustang(float f) {
		this(new int[] {10,20});
		System.out.println("C");
	}
	static int [][] arr2=new int[20][10];
	public Mustang(int [] arr) {
		System.out.println("D");
		
	}
	public Mustang(int [] arr,int [][]arr3) {
		this(0.8f);
		System.out.println("E");
	}
}