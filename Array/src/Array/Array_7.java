package Array;

public class Array_7 {
	public static void main(String[] args) {
		
		  int [] arr=new int[1000];	  
		  
		  
		  for(int i=0;i<1000;i++)
		  {
			  arr[i]=i+1;//filling the array :::
		  }
		  
		
		  for(int i=0;i<1000;i++)
		  {
			  if(arr[i]%4==0) 		  {
				  System.out.println(arr[i]); 
			  }
		  }
		  
	     
		}


}
