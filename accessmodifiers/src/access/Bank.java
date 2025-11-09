package access;

public class Bank {

	public void display() {
		System.out.println("name is :SBI"  +  ":        public");
	
}
	protected void pincode() {
		System.out.println("2356753"  +  ":             protected");
		
	}
	void branchmanager() {
		System.out.println("Alex zander"  + ":         default");
		
	}
	private void totalcash() {
		System.out.println("123.66 lakhs"  +  ":        private");
	}
	public static void main(String[]args) {
		Bank b1 = new Bank();
		b1.display();
		b1.pincode();
		b1.branchmanager();
		b1.totalcash();
		
	}
}
