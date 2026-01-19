package method_Referance;

import java.util.function.Supplier;

public class Constructor_referance {
	public static void main(String[]args) {
		Supplier<StringBuffer> str = StringBuffer::new;
		
		System.out.println(str.get().append("asfbb"+"  "+"Amegfjghjk").reverse());
		
		System.out.println("Amatr"+" "+"Bhise");
	}

}
