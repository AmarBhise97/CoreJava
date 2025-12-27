package Collection_1;

public class Seventh {
public static void main(String[]args) {
	Arrayee<int []> are =(t1)->{System.out.println("SingleInteger :"+t1[8]);};
	are.arr(new int[] {1,2,3,4,5,6,7,8,9,10});
	
	MultyArray<Integer [][]>are1 =(t1)->{System.out.println("Integer : "+t1[2][2]);};
	are1.arr1(new Integer[][]{{1,2,3},{4,5,6} ,{7,8,9},{10,11,12}});
	
	MultyArray<String [][]> are2 =(t1)->{System.out.println("String  : "+t1[1][1]);};
	are2.arr1(new String[][] {{"A","B","C"},{"D","G","H"},{"K","J","L"},{"M","N","O"}});
	
	MultyArray <Double[][]> are3=(t1)->{System.out.println("Double  :"+t1[1][1]);};
	are3.arr1(new Double[][] {{1.1,2.1,3.1},{4.1,5.1,6.1},{7.1,8.1,9.1},{10.1,11.1,12.1}});
	
	MultyArray <Float [][]> are4=(t1)->{System.out.println("Float   : "+t1[0][1]);};
	are4.arr1(new Float [][] {{10.0f,20.0f,30.0f},{40.0f,50.0f,60.0f},{70.0f,80.0f,90.f},{100.0f,110.f,120.0f}});
	
	MultyArray<Long[][]> are5 =(t1)->{System.out.println("Long    : "+t1[1][0]);};
	are5.arr1(new Long[][] {{1l,2l,3l},{4l,5l,6l},{7l,8l,9l},{10l,11l,12l}});
}
}


interface Arrayee <T>{
	 void arr(T t1);
}

interface MultyArray <T>{
	void arr1(T t1);
}