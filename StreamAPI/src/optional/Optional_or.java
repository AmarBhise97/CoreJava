package optional;

import java.util.Optional;

public class Optional_or {
	public static void main(String[] args) {

		Optional<String> op = Optional.ofNullable("Amar");
		System.out.println(op.or(() -> (Optional.of("null value detected"))));

		System.out.println("=======================================================");

		Optional<String> op1 = Optional.ofNullable(null);
		System.out.println(op1.get());
        System.out.println(op1.or(() -> (Optional.of("null value detected"))));

	}

}
