package Collection_1;

public class Eight {
public static void main(String[]args) {
	Calculator1<String> ct =(t1,t2,t3)->{ int id=10;String name ="Amar";Double Price =1200.9 ; return id + name + Price;};
	System.out.println(ct.Calculator1(10, "Ankit", 1200.0));
}
}
interface Calculator1<T>{
	void Calculate (T t1 ,T t2,T t3);
}


class DigitalCalculator implements Calculator1{


	public  void Calculate(Object t1, Object t2,Object t3) {
		int id ;
		String name ;
		Double Price;
		System.out.println( id + name + Price);
	}
	
}}


















