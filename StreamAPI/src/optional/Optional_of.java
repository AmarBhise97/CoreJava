package optional;

import java.util.Optional;

public class Optional_of {
	public static void main(String[]args){
		
		Optional<String> op = Optional.of(null);
		System.out.println(op.get()+op.isPresent());
	}

}
