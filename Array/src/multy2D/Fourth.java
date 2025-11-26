package multy2D;

public class Fourth {
	public static void main(String[] args) {
		// int arr[][]=new int[3][4];
		int arr[][] = new int[6][8];// {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
