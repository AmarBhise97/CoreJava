package exception;

public class Excep_1 {
	public static void main(String[]args) {
		try {
		Student.approve(1200.6, 2);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}

}
class Isexpensive extends Exception{
	public Isexpensive (String str) {
		super("is very expencive");
	}
}
class Notfoundex extends Exception{
	public Notfoundex (String str) {
		super("is not found");
	}
}
class Student{
	static int[]student= {1,3,4,5,7,8,9,0};
	
	public static void approve(double price,int id)throws Isexpensive ,Notfoundex {
		if(price>1500) {
			throw new Isexpensive("please reduce this price");
		}
		System.out.println("purchase approved");
	
	boolean isavailable=false;
	for(int i=0;i<student.length;i++) {
		if(student[i]==id) {
			isavailable=true;
			
		}}
		if(!isavailable) {
			throw new Notfoundex("not founded...");
		}
		
		
	
	System.out.println("is available : "+id);
}
}