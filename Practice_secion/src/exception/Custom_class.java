package exception;

public class Custom_class {
	public static void main(String[] args) throws Exception {
		Laptop lp = new Laptop();
		try {
			lp.printing();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			lp.print2();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

class Laptop {
	int id = 4;
	int price = 2001;

	public void printing() throws Exception {
		if (id > 5) {
			throw new Exception("Not vallid id");

		}
		System.out.println("valid id");
	}

	public void print2() throws Exception {
		if (price > 2000) {
			throw new Exception("not approvel for this object......");
		}
		System.out.println("approve......");
	}

}
