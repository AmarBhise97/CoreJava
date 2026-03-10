package Inheritance;

public class SingleInheritance {
	


	    public static void main(String[] args) {
	        Car c = new Car();

	        c.start();  // inherited from Vehicle
	        c.drive();  // own method
	    }
	}


class VehicleS {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends VehicleS {
    void drive() {
        System.out.println("Car is driving");
    }
}
