package array;

public class jagged_1 {
	public static void main(String []args) {
		int [][]arr= new int [4][];
		
		arr[0]= new int [3];
		arr[1]= new int [6];
		arr[2]= new int [3];
		arr[3]= new int [5];
	
		int count =1;
		for (int i=0;i<4;i++) {
			for(int j=0;j < arr[i].length;j++) {
			arr[i][j]=count;
			count++;
		}
		}
		
		for (int i=0;i<4;i++) {
			for(int j= 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
