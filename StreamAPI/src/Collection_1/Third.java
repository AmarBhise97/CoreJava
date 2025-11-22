package Collection_1;



public class Third {
public static void main(String[]args) {
	Calculator<Integer> add=(t1,t2)-> {return t1+t2;};
	Calculator<Integer> add1=(t1,t2)-> {return t1-t2;};
	Calculator<Integer> add2=(t1,t2)-> {return t1/t2;};
	Calculator<Integer> add3=(t1,t2)-> {return t1*t2;};
	System.out.println("Addition : "+add.addition(100, 10));
	System.out.println("Subtraction : "+add1.addition(100, 10));
	System.out.println("Division : "+add2.addition(100, 10));
	System.out.println("Multiplication : "+add3.addition(100, 10));
	
	Printerk<int[]> printt=(k1)->{System.out.println (k1[5]);
	;};
	printt.print(new int[] {1,2,3,4,5,6,7,8,9,10});
}
}
interface Calculator<T>{
	public T  addition(T t1,T t2);
	
}
interface Printerk<K>{
	public void print(K k1);
}
