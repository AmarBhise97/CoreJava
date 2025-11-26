package multy2D;

public class Second {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int i[] : arr) {
			for (int element : i) {

				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
