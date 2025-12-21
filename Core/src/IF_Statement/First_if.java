package IF_Statement;

public class First_if {
public static void main(String[] args) {
		
		int age=-110;
		
		if(age>0 && age<=10)
		{
			System.out.println("new born child");
		}
		else if(age>10 && age<=20)
		{
			System.out.println("Teenager");
		}
		else if(age>20 && age<=30)
		{
			System.out.println(" young adults");
		}
		else
		{
			System.out.println("oldie");
		}
	}

}
