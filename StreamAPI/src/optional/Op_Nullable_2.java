package optional;

import java.util.Optional;

public class Op_Nullable_2 {
	public static void main(String[]args) {
		Optional<String> op = Optional.ofNullable(null);
		//op.ifPresent(System.out::println);
		
		op.ifPresentOrElse((i)->{System.out.println(i.toUpperCase());}
		, ()->{System.out.println("Not an valid");});
	}

}
