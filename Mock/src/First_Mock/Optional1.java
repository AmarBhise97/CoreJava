package First_Mock;

import java.util.Optional;

public class Optional1 {
	public static void main(String[]args) {
		Optional<String>op = Optional.of(null+"Amar");
		Optional<String>op1 = Optional.ofNullable("Amar"+null);
		Optional<String>op2 = Optional.ofNullable("null"+"Amar");
		
		System.out.println(op.orElse("Default value"));
		System.out.println(op1.orElse("Default value"));
		System.out.println(op2.orElse("Default value"));
	}

}
