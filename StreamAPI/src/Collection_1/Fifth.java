package Collection_1;

public class Fifth {
public static void main(String[]args) {
	Car<String> car = (t1,t2)-> t1 +" "+ t2;
	Car<String> car2 = (t1,t2)-> {return t1 + t2;};
	Car<String> car3 = (t1,t2)-> {return t1 + t2;};
	Car<String> car4 = (t1,t2)-> {return t1 + t2;};
	System.out.println("Car Type :"+car.Startcar("Ev Varient"," Consume Electricity"));
	System.out.println("Car Type :"+car.Startcar("Deasel Varient"," Consume Deasel"));
	System.out.println("Car Type :"+car.Startcar("Petrol Varient"," Consume Petrol"));
	System.out.println("Car Type :"+car.Startcar("CNG Varient"," Consume CNG"));
	
}
}
interface Car<T>{
	public T Startcar(T t1 ,T t2);
}