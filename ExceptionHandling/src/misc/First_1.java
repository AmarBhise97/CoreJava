package misc;

public class First_1 {
	public static void main(String[] args) //throws ExpensiveException, NotFoundException
	{
		try {
       Student.purchaseBeg(1552, 0);
		}
		catch(NotFoundException   | ExpensiveException ex ) {
			System.out.println(ex.getMessage());
		}
	}
}

class ExpensiveException extends Exception {

	public ExpensiveException(String str) {
		super(str);

	}
}

class NotFoundException extends Throwable {
	public NotFoundException(String str) {
		super(str);
	}
}

class Student{
	static int[]student= {1,2,3,5,6,7,10,12,13};
	public static void purchaseBeg(double price,int id) throws ExpensiveException,NotFoundException{
		if(price>1500.00) {
			throw new ExpensiveException("Please reduce the price");
			
		}
		System.out.println("Purchase Approved...");
		boolean isavailable = false;
		for(int i=0;i<student.length;i++) {
			if(student[i]==id) {
				isavailable=true;
				
			}
		}
		if(!isavailable) {
			throw new NotFoundException("No Student Available");
		}
		System.out.println("Student found :"+id);
	}
}





