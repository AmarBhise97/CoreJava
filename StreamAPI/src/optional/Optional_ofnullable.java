package optional;

import java.util.Optional;

public class Optional_ofnullable {
	public static void main(String[]args) {
		Optional<String> op = Optional.ofNullable("Amar");
		System.out.println(op.isEmpty());
		System.out.println(op);
		System.out.println(op.get());
		
		System.out.println("=================================================");
		
		Optional<String> op1 = Optional.ofNullable(null);
		System.out.println(op1.isEmpty());
		System.out.println(op1);
		
		
		System.out.println(op1.get());
	}

}
