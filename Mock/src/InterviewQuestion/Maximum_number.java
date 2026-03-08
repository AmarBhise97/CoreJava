package InterviewQuestion;

public class Maximum_number {
	public static void main(String[]args) {
		
		int arr[]= {10,5,80,59,70};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
