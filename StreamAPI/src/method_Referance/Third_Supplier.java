package method_Referance;

import java.util.function.Supplier;

public class Third_Supplier {
	public static void main(String[]args) {
		Supplier<Integer> sup = ()->(1+1);
	System.out.println(sup.get());
	}

}
