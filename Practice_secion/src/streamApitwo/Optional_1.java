package streamApitwo;

import java.util.Optional;

public class Optional_1 {
	public static void main(String[]args) {
		
		Optional<String>op = Optional.of(null+"asdfg");
		System.out.println(op);
		
		Optional<String> op1 = Optional.ofNullable("Amar");
		
		//op1.ifPresent(System.out::println );
		op1.ifPresentOrElse((i)->{System.out.println(i.toUpperCase());},()->{System.out.println("not a valid");} );
		
	}

}
