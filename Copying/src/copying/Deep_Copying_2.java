package copying;

public class Deep_Copying_2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("123456", "Pune");

		Order od = new Order(1200, "Machine", add);
		System.out.println(od);
		System.out .println("===============================================");
		

		Order od2 =od;
		od2.address.pincode="78906";
		System.out.println(od2);
		
		Order od3 = (Order)od.clone();
		
		System.out.println(od);
		System.out.println(od2);
		System.out.println(od3);
		
		

	}

}

class Order {
	int price;
	String Item;
	Address address;

	public Order(int price, String Item, Address address) {
		this.price = price;
		this.Item = Item;
		this.address = address;

	}

	public Object clone() throws CloneNotSupportedException {
		Order o2 = (Order) super.clone();
		o2.address = (Address) this.address.clone();
		return o2;
	}

	public String toString() {
		return this.price + " " + Item + " " + address.city + " " + address.pincode;
	}

}

class Address {
	String pincode;
	String city;

	public Address(String pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
