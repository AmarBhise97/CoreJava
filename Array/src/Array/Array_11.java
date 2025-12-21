package Array;

public class Array_11 {
public static void main(String[] args) {
		
		int[] arr=new int[5]; //4*5=>20 bytes
		

		
		boolean flag=true;
		
		if(flag==true)
		{
			System.out.println("yes");
			flag=false;
			if(flag==false) //true
			{
				System.out.println("inner yes");
			}
		}
		else
		{
			System.out.println("no");
		}
	}

}
