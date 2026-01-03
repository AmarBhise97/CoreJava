package array;

public class One_D {
	public static void main(String[]args) {
		int arr[]=new int [10];
		int first =50;
		for (int i= 0; i<arr.length;i++) {
			arr[i]=first;
			first++;
			System.out.println(first);
			
			System.out.println(arr[i]);
			System.out.println("=====================================");
		}
		//System.out.println(arr[11]);
		
	}
	
	
}

