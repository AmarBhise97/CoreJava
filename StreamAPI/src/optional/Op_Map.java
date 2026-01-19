package optional;

import java.util.Optional;

public class Op_Map {
	public static void main(String[]args) {
		Optional<String> op = Optional.ofNullable(null);
		System.out.println(op.map((i)->(i.length())));
		
		System.out.println("===========================================");
		
		Optional<String> op1 = Optional.ofNullable("Amar");
		System.out.println(op1.map((i)->(i.length())));
		split
	}

}
