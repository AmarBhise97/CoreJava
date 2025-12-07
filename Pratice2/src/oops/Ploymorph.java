package oops;

public class Ploymorph {
	public static void main(String[] args) {
		Mobile mo =new Mobile();
		mo.add("oppo", "A15");
		mo.add("Jio", "A16", "2025");
		mo.add("Vivo", "K11", 45);

	}

}

class Mobile {
	String name;
	String device;
	String model;
	int picno;
	
	
	public void add(String name,String device) {
		System.out.println(name +":name :: "+device +":device");
	}
	public void add(String name,String device,String model) {
		System.out.println(name+":name :: "+device+":device :: "+model+":model :: ");
		
	}
	public void add(String model,String device,int pincon) {
		System.out.println(name+":name :: "+device+":device :: "+pincon+":pincon :: ");
	}
	
	public void add(int pincon,String device,String model) {
		System.out.println(name+":name :: "+device+":device :: "+pincon+":pincon :: ");
	}
}