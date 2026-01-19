package optional;

import java.util.Optional;

public class Op_Filter {
	public static void main(String[]args) {
		Optional<String> op= Optional.ofNullable(null);
		
		System.out.println(op.filter((i)->(i.length()>0)));
		
		//optional.empty.............
	 }

}
