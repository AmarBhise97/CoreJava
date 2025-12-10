package method_Referance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Arbitary_Custom {
	public static void main(String[] args) {

		List<Car> list = Arrays.asList(new Car(1, 5.0, "BMW"), new Car(2, 5.7, "Fortuner"), new Car(3, 5.6, "Swift"));
		list.stream().map(Car::total).forEach(System.out::println);
		
		System.out.println("============================================");
		
		List<Car> list1= Arrays.asList(new Car(0,0.0,"AMV"),new Car(0,0.0,"ZYX"));
		list.stream().map(Car::add2).forEach(System.out::println);
		
		System.out.println("===========================================");
		
		
		Car c1 =new Car(0,0.0,"XYZ");
		Function<String ,Integer> fun =(c1::add);
		System.out.println(fun.apply("AMAR--Bhise"));

	}

}

class Car {
	int id;
	double price;
	String name;

	public Car(int id, double price, String name) {
		this.id = id;
		this.price = price;
		this.name = name;

	}

	public int total() {
		return this.id + (int) price + this.name.length();
	}

	public int add(String str) {
		return str.length();
	}
	public int add2() {
		return 100;
	}
}
