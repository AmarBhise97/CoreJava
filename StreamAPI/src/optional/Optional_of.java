package optional;

import java.util.Optional;

public class Optional_of {
	public static void main(String[]args){
		
		Optional<String> op1 = Optional.of("Amar");
		System.out.println(op1.get()+"  "+op1.isPresent());
		
		
		Optional<String> op = Optional.of(null);
		System.out.println(op.isEmpty());
		System.out.println(op.isPresent());
		
		
		System.out.println(op.get()+op.isPresent()+op.isEmpty());
		
		
		
		
	}

}
