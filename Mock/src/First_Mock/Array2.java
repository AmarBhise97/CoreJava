package First_Mock;

public class Array2 {
	public static void main(String[]args) {
		int arr[]= {1,5,8,0,3,7,0,4,0};
		int counter =0;
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr2[counter++]=arr[i];
				
			}
		}
			for(int i:arr2) {
				System.out.print(i+" ");
			}
		
	}

}
