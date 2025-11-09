package access;

public class Bank_another {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		/**
		 * Accessing with the help of the object in different of same package.
		 */
		System.out.println("With the object-(........======........)-");
		b1.display();
		b1.branchmanager();
		b1.pincode();
		/**
		 * name is public alex zander is default 2356753 is protected
		 */

		/**
		 * now i am accessing with the inheritance in the different class of the same
		 * package.
		 * 
		 */
		System.out.println("With the Inheritance-(......===========...........)-");
		Minibank mb = new Minibank();
		mb.display();
		mb.pincode();
		mb.branchmanager();

	}
}

class Minibank extends Bank {

}
