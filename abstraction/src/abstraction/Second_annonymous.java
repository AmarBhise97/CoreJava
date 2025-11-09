package abstraction;

public class Second_annonymous {
public static void main(String[]args) {
	City city = new City() {

		@Override
		public void showpincode(String name) {
			// TODO Auto-generated method stub
			System.out.println("Hiiiii...."+name);
		}
		
		
	};
	city.show();
	city.showpincode("1234");
}
}
abstract class City{
	String name;
	public void show() {
		System.out.println(this.name);
	}
	abstract public void showpincode(String name);
	
}