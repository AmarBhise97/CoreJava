package First_Mock;

public class Arrays {
	public static void main(String[]args) {
		int arr[]= {1,0,3,0,5,6,0};
		
		int count =arr.length-1;
		int arr2[]=new int [arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr2[count]=arr[i];
				count--;
			}
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
	}

}
