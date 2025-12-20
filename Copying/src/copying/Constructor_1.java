package copying;

public class Constructor_1 {
	public static void main(String[]args) {
		Car c1 = new Car("BB9",1500);
		Car c2 = (c1);
		//System.out.println(c1);
		//System.out.println(c2);
		c2.Model="CCR9";
		System.out.println(c2.Model);
		System.out.println(c1.Model);
	}

}
class Car{
	String Model;
	int Capacity;
	
	public Car(String Model,int Capacity) {
		this.Model=Model;
		this. Capacity=Capacity;
	}
	public Car(Car car) {
		this.Model=car.Model;
		this.Capacity=car.Capacity;
	}
}
