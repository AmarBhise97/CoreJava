package obj2;

public class Amazon_Order {
public static void main(String[]args) {
	Order order=new Order(Adress.getobj());
	order.date="12/5/2035";
	order.item=new String[]{"tv","laptop"};
	order.price=12000.55;
	
	System.out.println(order);
}
}
class Order{
	double price;
	String[]item;
	String date;
	Adress adress;
	
	public String toString() {
		return this.price + " " + this.date +" "+this.item;
	}
	public Order(Adress adress) {
		adress=adress;
	}
	public void DispatchOrder() {
		System.out.println("order dispatch to the address"+adress);
	}
}
class Adress{
	String city;
	String pincode;
	String mobile;
	String landmark;
	
	public String toString() {
		return "adress is:"+this.city+' '+this.pincode+" "+this.mobile+" "+this.landmark;
	}
	public static Adress getobj() {
		Adress adress=new Adress();
		adress.city="pune";
		adress.pincode="12342132";
		adress.mobile="3456789098";
		adress.landmark="kothrud";
		System.out.println(adress);
		return adress;
		
	}
		
}