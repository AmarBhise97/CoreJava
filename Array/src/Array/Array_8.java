package Array;

public class Array_8 {
public static void main(String[] args) {
		
		int[] arr=new int[1000];
		
		
		
		int sum=0;
		for(int i=0;i<1000;i++)
		{
			arr[i]=i+1;
		}
		
		
		
	
		for(int i=0;i<1000;i++)
		{
			if(arr[i] >=998)
			{
				sum=sum+arr[i]; 
			}
			
		}

	
		
		System.out.println(sum);
	}

}
