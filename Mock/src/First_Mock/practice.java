package First_Mock;

public class practice {

	public static void main1(String[] args) {
		
		int  arr[]={1,2,3,0,6,8,4,0,8,0,6};
		int count=0;
		int arr2[]= new int [arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr2[count]=arr[i] ;
				count++;
				
				
			}
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		
		

	}
	
	public static void main2(String[]args) {
		
		int arr[]= {1,4,0,9,6,0,8,0,6};
		
		int count =arr.length-1;
		int arr2[]=new int [arr.length];
		
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]!=0) {
				arr2[count]=arr[i];
				count--;
			}
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void main(String[]args) {
		
		int a=60;
		int b=40;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
	    System.out.println(b);
	   
		
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				//System.out.print("Even  " +i+"     ");
			}
			
			else {
				//System.out.print("odd  "+i);
			}
			System.out.println("   ");
		}
		
		for(int i=2;i<10;i++) {
			boolean flag =false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
					
				}
			}
			if(!flag) {
				System.out.print(i+" ");
			}
		}
		
	}

}
