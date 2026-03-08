package InterviewQuestion;

public class RemoveDuplicate {
	public static void main(String[]args) {
		
		int arr[]= {1,2,4,7,2,4,7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//System.out.println(arr[j]);
					//System.out.println(arr[i]);
					System.out.println(arr[j]);
				}
				
			}
		}
		
		
	}

}
